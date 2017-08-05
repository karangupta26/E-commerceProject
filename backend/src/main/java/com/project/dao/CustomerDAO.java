package com.project.dao;

import com.project.model.Customer;
import com.project.model.User;

public interface CustomerDAO {
	void registerCustomer(Customer customer);
	User validateUserName(String username);
	Customer validateEmail(String email);
}
