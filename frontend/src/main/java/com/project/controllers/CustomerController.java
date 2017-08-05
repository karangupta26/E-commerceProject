package com.project.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.model.Customer;
import com.project.model.User;
import com.project.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping(value="/CustomerForm")
	public String getCustomerSignUpForm(Model model){
		model.addAttribute("customer",new Customer());
		return "CustomerSignUpPage";
	}
	@RequestMapping(value="/registercustomer")
	public String registerCustomer(@Valid @ModelAttribute Customer customer,BindingResult result,Model model){
		if(result.hasErrors()){
			return "CustomerSignUpPage";
		}
		User user=customerService.validateUserName(customer.getUser().getUsername());
		if(user!=null){//For Duplicate UserName
			model.addAttribute("duplicatUsername", "Username Already Exists.");
			return "CustomerSignUpPage";			
		}
		Customer email=customerService.validateEmail(customer.getEmail());
		if(email!=null){//For Duplicate Email
			model.addAttribute("duplicateEmail", "Email Already Exists.");
			return "CustomerSignUpPage";
		}
		customerService.registerCustomer(customer);
		return "Home";
	}
}
