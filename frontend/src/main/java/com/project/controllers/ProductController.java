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
import com.project.service.ProductService;
import com.project.model.Category;
//import com.project.service.ProductServiceImpl;
import com.project.model.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping(value="/vendor/Product/ProductForm")
	public String productForm(Model model) {
		List<Category> catObj=productService.getAllCategory();
		model.addAttribute("product", new Product());
		model.addAttribute("categories",catObj);
		List<Product> productObj=productService.getAllProducts();
		model.addAttribute("productList",productObj);
		return "ProductForm";
	}
	@RequestMapping(value="/vendor/Product/saveproduct")
	public String saveProduct(@Valid @ModelAttribute(name="product") Product product,BindingResult result,Model model){
		if(result.hasErrors()){
			List<Category> categories=productService.getAllCategory();
			model.addAttribute("categories",categories);
			return "ProductForm";
		}
		productService.addProduct(product);
		MultipartFile image=product.getImage();
		Path path=Paths.get("C:\\Users\\Karan\\workspace\\frontend\\src\\main\\webapp\\WEB-INF\\resources\\productImages\\"+product.getPid()+".jpeg");
		try{
			image.transferTo(new File(path.toString()));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return "Home";
	}
	@RequestMapping(value="/vendor/editProduct/editForm/{pid}")
	public String editProductForm(@PathVariable("pid") int id,Model model){
		Product product=productService.getProductById(id);
		model.addAttribute("productEdit", product);
		List<Category> categories=productService.getAllCategory();
		model.addAttribute("categories",categories);
		return "EditProduct";
	}
	@RequestMapping(value="/vendor/editProduct/editFunction")
	public String editProduct(@ModelAttribute(name="productEdit") Product product){
		productService.updateProduct(product);
		return "redirect:/ProductForm";
	}
	@RequestMapping(value="/vendor/deleteProduct/{pid}")
	public String deleteProduct(@PathVariable("pid") int id){
		productService.deleteProduct(id);
		return "redirect:/ProductForm";
	}
	@RequestMapping(value="/product/details/{id}")
	public String getProductById(@PathVariable int id,Model model){
		Product product=productService.getProductById(id);
		model.addAttribute("productDetails", product);
		return "ViewProduct";
	}
	
}
