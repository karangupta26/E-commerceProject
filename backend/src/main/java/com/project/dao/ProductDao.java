package com.project.dao;

import com.project.model.*;
import java.util.List;

public interface ProductDAO {
	public List<Product> getAllProducts();
	public Product getProductById(int productId);
	public void addProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(int productId);
	public List<Product> getAllProductsByCategory(int cid);
	public List<Category> getAllCategory();
}
