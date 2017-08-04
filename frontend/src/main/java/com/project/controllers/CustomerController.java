package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.model.Customer;
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
	public String registerCustomer(@ModelAttribute Customer customer,BindingResult result){
		if(result.hasErrors()){
			return "CustomerSignUpPage";
		}
		customerService.registerCustomer(customer);
		return "Home";
	}
}
