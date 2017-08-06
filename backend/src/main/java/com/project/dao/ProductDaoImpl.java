package com.project.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.project.model.Category;
import com.project.model.Product;
@Repository("ProductDao")
@EnableTransactionManagement
public class ProductDAOImpl implements ProductDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	public Product getProductById(int productId) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class, productId);
		return product;
	}

	public void updateProduct(Product product) {
		Session session=sessionFactory.getCurrentSession();
		session.update(product);
		
	}

	public void deleteProduct(int productId) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.createQuery("from Product where productId="+productId);
		session.delete(product);
		
	}

	public List<Product> getAllProductsByCategory(int cid) {
		Session session=sessionFactory.getCurrentSession();
		List<Product> products=session.createQuery("from Product where category='"+cid+"'").list();
		return products;
	}
	public List<Product> getAllProducts() {
		Session session=sessionFactory.getCurrentSession();
		List<Product> products=session.createQuery("from Product").list();
		return products;
	}

	public List<Category> getAllCategory() {
		Session session=sessionFactory.getCurrentSession();
		List<Category> category=(List)session.createQuery("from Category").list();
		return category;
	}

	public void addProduct(Product product) {
		Session session=sessionFactory.getCurrentSession();
		session.save(product); 
		
	}

}
