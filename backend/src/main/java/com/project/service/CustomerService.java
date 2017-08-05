package com.project.service;

import com.project.model.Customer;
import com.project.model.User;

public interface CustomerService {
	void registerCustomer(Customer customer);
	User validateUserName(String username);
	Customer validateEmail(String email);
}
