package com.cit.exception;

import org.hibernate.exception.DataException;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cit.exception.ApplicationException;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
	
	@ExceptionHandler(ApplicationException.class)

	public String handleException(ApplicationException error, Model model) {
		String errorMessage="Please check the Issue Id";
		model.addAttribute("msg", errorMessage);
		return "error1";
	}
	@ExceptionHandler(MissingServletRequestParameterException.class)
    public String handleMissingParams1(MissingServletRequestParameterException error, Model model) {
        String errormsg="Please Select atleast one option in Customer Page";
        model.addAttribute("msg",errormsg);
        return "error1";
    }   
   
    @ExceptionHandler(BindException.class)
    public String handleMissingParams(BindException error, Model model) {
        String errormsg="Please enter data to raise a issue";
        model.addAttribute("msg",errormsg);
        return "error1";
    }   
    @ExceptionHandler(DataException.class)
    public String handleMissingParams2(DataException error, Model model) {
        String errormsg="Please check the format of date you have entered";
        model.addAttribute("msg",errormsg);
        return "error1";
    } 
}