package com.project.controllers;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

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
		List<Category> catObj=productService.getAllCategory();
		model.addAttribute("product", new Product());
		model.addAttribute("categories",catObj);
		List<Product> productObj=productService.getAllProducts();
		model.addAttribute("productList",productObj);
		return "ProductForm";
	}
	@RequestMapping(value="/saveproduct")
	public String saveProduct(@Valid @ModelAttribute(name="product") Product product,BindingResult result,Model model){
		if(result.hasErrors()){
			List<Category> categories=productService.getAllCategory();
			model.addAttribute("categories",categories);
			return "ProductForm";
		}
		System.out.println("No errors");
		productService.addProduct(product);
		System.out.println("Product Added");
		MultipartFile image=product.getImage();
		System.out.println("Image uploading");
		Path path=Paths.get("C:\\Users\\Karan\\workspace\\frontend\\src\\main\\webapp\\WEB-INF\\resources\\productImages\\"+product.getPid()+".jpeg");
		System.out.println("Try and catch Block Starts");
		try{
			image.transferTo(new File(path.toString()));
			System.out.println("Image Transfered");
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Image Uploaded");
		
		return "Home";
	}
	@RequestMapping(value="/vendor/editProduct/editForm/{pid}")
	public String EditProduct(@PathVariable("pid") int id,Model model){
		Product product=productService.getProductById(id);
		model.addAttribute("productEdit", product);
		return "EditProduct";
	}
	@RequestMapping(value="/vendor/deleteProduct/{pid}")
	public String deleteProduct(@PathVariable("pid") int id){
		productService.deleteProduct(id);
		return "redirect:/ProductForm";
	}
	
	
}
