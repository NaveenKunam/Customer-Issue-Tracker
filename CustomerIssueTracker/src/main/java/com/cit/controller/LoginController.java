package com.cit.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cit.dao.CustomerRepo;
import com.cit.exception.ApplicationException;
import com.cit.model.Customer;
import com.cit.model.IssueDetail;
import com.cit.service.CustomerIssueService;

@Controller
public class LoginController {

	@Autowired
	CustomerRepo repo;
	
	@Autowired
	CustomerIssueService custService;
	
	@RequestMapping(value="/login1", method=RequestMethod.GET)
	public String showLoginPage(@ModelAttribute("customer") Customer customer ) {
		return "customerform";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String showCustomerPage(@Valid @ModelAttribute("customer") Customer customer, BindingResult result, ModelMap map)throws ApplicationException	
		
	{
		if(result.hasErrors()) {
			return "customerform";
		}
		return "login";
	}
	
	@GetMapping(value="/customerform")
	public String showCustomerForm(@ModelAttribute("IssueDetail") IssueDetail issueDetail, @RequestParam("radioName") String radioName, @RequestParam("issueId") String issueId, ModelMap map) throws ApplicationException {
		
		String raise="raise";
		String view="view";
		if(radioName.equals(raise)) {
			System.out.println("raise");
			return "raiseissue";
		} 
		else if(radioName.equals(view)) {
			int count=0;
			System.out.println("issue");
			List<IssueDetail> list= custService.findissueid(issueId);
			for(IssueDetail i: list) {
				map.addAttribute("issueId",i.getCustIssueId());
				map.addAttribute("issueDate",i.getIssueReportDate());
				map.addAttribute("cusId",i.getCustId());
				map.addAttribute("cat",i.getCategory());
				map.addAttribute("desc",i.getDescription());
				map.addAttribute("status",i.getIssueStatus());
				map.addAttribute("ccrId",i.getCcRepId());
				count++;
			} 
			if(count==0) {
				throw new ApplicationException();
			}
		}
		return "customerissue";
	}
	
	@RequestMapping(value="/customerPage")
	public String customerPage() {
		return "login";
	}
	
	@PostMapping(path="/issueraised")
	public String addIssue(@Valid @ModelAttribute("IssueDetail") IssueDetail issueDetail, BindingResult result) throws ApplicationException {
		if(result.hasErrors()) {
			return "raiseissue";
		}
		System.out.println("issue raised");
		repo.save(issueDetail);
		return "issueraised";
		//return custService.raiseIssue(issueDetail);
	}
	
}
