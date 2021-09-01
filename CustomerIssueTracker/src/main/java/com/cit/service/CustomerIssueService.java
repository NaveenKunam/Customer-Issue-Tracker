package com.cit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cit.dao.CustomerRepo;
import com.cit.model.IssueDetail;

@Service
public class CustomerIssueService {

	@Autowired
	CustomerRepo repo;
	
	public IssueDetail raiseIssue(IssueDetail issueDetail) {
		return repo.save(issueDetail);
	}
	
	public List<IssueDetail> findissueid(String issueId) {
        // TODO Auto-generated method stub
        return repo.findBycustIssueId(issueId);
    }
	
}
