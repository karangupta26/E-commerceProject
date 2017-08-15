package com.project.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Query;
import org.hibernate.Session;

import com.project.model.Authorities;
import com.project.model.Cart;
import com.project.model.Customer;
import com.project.model.User;
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public void registerCustomer(Customer customer) {
		User user=customer.getUser();
		user.setEnabled(true);
		String username=customer.getUser().getUsername();
		
		Authorities authorities=new Authorities();
		authorities.setRole("ROLE_CUSTOMER");
		authorities.setUsername(username);
		
		Session session=sessionFactory.getCurrentSession();
		session.save(authorities);
		
		Cart cart=new Cart();
		cart.setCustomer(customer);
		customer.setCart(cart);
		session.save(customer);
		
	}
	public User validateUserName(String username) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from User where username=?");
		query.setString(0, username);
		User user=(User)query.uniqueResult();
		return user;
	}
	public Customer validateEmail(String email) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Customer where email=?");
		query.setString(0, email);
		Customer customer=(Customer)query.uniqueResult();
		return customer;
	}
	public Customer getCustomerByUsername(String username) {
		Session session=sessionFactory.getCurrentSession();
		Customer customer=(Customer)session.get(Customer.class, username);
		return customer;
	}

}
