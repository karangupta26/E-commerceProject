package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.model.Vendor;
@Controller
public class VendorController {
	@RequestMapping("/Vendor")
	public String getVendorLoginAndSignUp(Model model){
		model.addAttribute("vendor",new Vendor());
		return "VendorLoginAndSignUp";
	}
	@RequestMapping("/VendorSignUpRegister")
	public String VendorSignUp(@ModelAttribute Vendor vendor,BindingResult result){
		
		return "Home";
	}
	
}
