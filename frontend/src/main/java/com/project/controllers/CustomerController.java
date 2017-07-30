package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.project.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
}
