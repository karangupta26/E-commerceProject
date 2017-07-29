package com.project.controllers;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
import org.springframework.validation.BindingResult;
=======
>>>>>>> origin/master
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.service.ProductService;
//import com.project.service.ProductServiceImpl;
import com.project.model.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
<<<<<<< HEAD
	@RequestMapping(value="/ProductForm")
	public ModelAndView productForm() {
		//model.addAttribute("product", new Product());
		return new ModelAndView("ProductFrom","product",new Product());
	}
	@RequestMapping(value="/saveproduct")
	public String saveProduct(@ModelAttribute(name="product") Product product,BindingResult result){
=======
	@RequestMapping("/ProductForm")
	public String productForm(Model model ) {
		System.out.println("Product form");
		model.addAttribute("product", new Product());
		return "ProductForm";
	}
	@RequestMapping("/saveproduct")
	public String saveProduct(@ModelAttribute(name="product") Product product){
		System.out.println("Save product");
>>>>>>> origin/master
		productService.addProduct(product);
		return "Home";
	}
}
