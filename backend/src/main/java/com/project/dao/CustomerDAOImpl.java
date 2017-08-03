package com.project.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;

import com.project.model.Authorities;
import com.project.model.Cart;
import com.project.model.Customer;
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public void registerCustomer(Customer customer) {
		String username=customer.getEmail();
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

}
