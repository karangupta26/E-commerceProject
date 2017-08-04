package com.project.controllers;

import java.util.List;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.service.ProductService;
import com.google.gson.Gson;
import com.project.model.Category;
//import com.project.service.ProductServiceImpl;
import com.project.model.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping(value="/ProductForm")
	public String productForm(Model model) {
		List<Category> catobj=productService.getAllCategory();
		model.addAttribute("product", new Product());
		model.addAttribute("categories",catobj);
		
		System.out.println(catobj);
		return "ProductForm";
	}
	/*@RequestMapping(value="/ProductForm")
	public ModelAndView productForm(){
		List<Category> catobj=productService.getAllCategory();
		String  categorylist=new Gson().toJson(catobj);
		ModelAndView model=new ModelAndView("ProductForm");
		model.addObject("categories", categorylist);
		return model;
	}*/
	@RequestMapping(value="/saveproduct")
	public String saveProduct(@ModelAttribute(name="product") Product product,BindingResult result){
		productService.addProduct(product);
		return "Home";
	}
	
}
