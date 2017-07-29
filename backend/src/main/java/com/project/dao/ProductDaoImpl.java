package com.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.project.model.Product;
@Repository("ProductDao")
@EnableTransactionManagement
public class ProductDaoImpl implements ProductDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	public Product getProductById(int productId) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.createQuery("from Product where id="+productId);
		return product;
	}

	public void addProduct(Product product) {
		Session session=sessionFactory.getCurrentSession();
		session.save(product);
		
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

}
