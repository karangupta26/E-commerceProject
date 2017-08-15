package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.CustomerDAO;
import com.project.model.Customer;
import com.project.model.User;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDAO customerDao;
	public void registerCustomer(Customer customer) {
		customerDao.registerCustomer(customer);
	}
	public User validateUserName(String username) {
		return customerDao.validateUserName(username);
	}
	public Customer validateEmail(String email) {
		return customerDao.validateEmail(email);
	}
	public Customer getCustomerByusername(String username) {
		return customerDao.getCustomerByUsername(username);
	}

}
