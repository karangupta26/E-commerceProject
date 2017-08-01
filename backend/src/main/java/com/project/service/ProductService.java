package com.project.service;

import java.util.List;

import com.project.model.Category;
import com.project.model.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	public Product getProductById(int productId);
	public void addProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(int productId);
	public List<Product> getAllProductsByCategory(int cid);
	public List<Category> getAllCategory();
}
