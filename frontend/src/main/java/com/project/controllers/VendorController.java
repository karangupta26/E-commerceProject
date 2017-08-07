package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.model.User;
import com.project.model.Vendor;
import com.project.service.VendorService;
@Controller
public class VendorController {
	@Autowired
	private VendorService vendorService;
	@RequestMapping("/Vendor")
	public String getVendorLoginAndSignUp(Model model){
		model.addAttribute("vendor",new Vendor());
		return "VendorLoginAndSignUp";
	}
	@RequestMapping("/VendorSignUpRegister")
	public String VendorSignUp(@ModelAttribute Vendor vendor,BindingResult result,Model model){
		if(result.hasErrors()){
			return "VendorLoginAndSignUp";
		}
		User user=vendorService.validateUserName(vendor.getVuser().getUsername());
		if(user!=null){
			model.addAttribute("duplicateVendor","Vendor Username Already Exists." );
			return "VendorLoginAndSignUp";
		}
		vendorService.registerVendor(vendor);
		return "Home";
	}
	
}
