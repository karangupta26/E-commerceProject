package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.ProductDAO;
import com.project.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDAO productDao;

	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	public Product getProductById(int productId) {
		return productDao.getProductById(productId); 
	}

	public void addProduct(Product product) {
		productDao.addProduct(product);
		
	}

	public void updateProduct(Product product) {
		productDao.updateProduct(product);
		
	}

	public void deleteProduct(int productId) {
		productDao.deleteProduct(productId);
		
	}

	public List<Product> getAllProductsByCategory(int cid) {
		return productDao.getAllProductsByCategory(cid);
	}
}
