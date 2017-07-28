package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.service.ProductService;
//import com.project.service.ProductServiceImpl;
import com.project.model.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/ProductForm")
	public String productForm(Model model ) {
		model.addAttribute("product", new Product());
		return "ProductForm";
	}
	@RequestMapping("/saveproduct")
	public String saveProduct(@ModelAttribute(name="product") Product product){
		productService.addProduct(product);
		return "Home";
	}
}
