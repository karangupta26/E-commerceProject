package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.model.Category;
import com.project.service.ProductService;
@Controller
public class HomeController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/Home")
	public String home(Model model){
		return "Home";
	}
	@RequestMapping("/AboutUs")
	public String aboutUs() {
		return "AboutUs";
	}
	@RequestMapping("/Login")
	public String login(){
		return "Login";
	}
	@RequestMapping(value="/invalidLogin")
	public String invalidLogin(){
		return "InvalidAuthorisation";
	}
}
