package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.model.Vendor;
import com.project.service.VendorService;
@Controller
public class VendorController {
	@Autowired
	private VendorService vandorService;
	@RequestMapping("/Vendor")
	public String getVendorLoginAndSignUp(Model model){
		model.addAttribute("vendor",new Vendor());
		return "VendorLoginAndSignUp";
	}
	@RequestMapping("/VendorSignUpRegister")
	public String VendorSignUp(@ModelAttribute Vendor vendor,BindingResult result){
		if(result.hasErrors()){
			return "VendorLoginAndSignUp";
		}
		vandorService.registerVendor(vendor);
		return "Home";
	}
	
}
