package com.project.controllers;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.service.ProductService;
//import com.project.service.ProductServiceImpl;
import com.project.model.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping(value="/ProductForm")
	public String productForm(Model model) {
		model.addAttribute("product", new Product());
		//return new ModelAndView("ProductFrom","Product",new Product());
		return "ProductForm";
	}
	@RequestMapping(value="/saveproduct")
	public String saveProduct(@ModelAttribute(name="product") Product product,BindingResult result){
		productService.addProduct(product);
		return "Home";
	}
}
