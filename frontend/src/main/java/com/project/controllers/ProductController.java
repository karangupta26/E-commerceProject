package com.project.controllers;

import java.util.ArrayList;
import java.util.List;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.service.ProductService;
import com.project.model.Category;
//import com.project.service.ProductServiceImpl;
import com.project.model.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping(value="/ProductForm")
	public String productForm(Model model) {
		model.addAttribute("categories", new Category());
		model.addAttribute("product", new Product());
		//return new ModelAndView("ProductFrom","Product",new Product());
		return "ProductForm";
	}
	@RequestMapping(value="/saveproduct")
	public String saveProduct(@ModelAttribute(name="product") Product product,BindingResult result){
		productService.addProduct(product);
		return "Home";
	}
	@ModelAttribute("categoryList")
	public List<String> getCategoryList (){
		List<String> categoryList=new ArrayList<String>();
		categoryList.add("Mens");
		categoryList.add("Womens");
		categoryList.add("Boys");
		categoryList.add("Girls");
		return categoryList;
	}
}
