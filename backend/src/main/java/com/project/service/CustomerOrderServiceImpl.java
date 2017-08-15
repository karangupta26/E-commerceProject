package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.CustomerOrderDAO;
import com.project.model.Cart;
import com.project.model.CustomerOrder;
@Service
@Transactional
public class CustomerOrderServiceImpl implements CustomerOrderService{
	@Autowired
	private CustomerOrderDAO customerOrderDao;
	public CustomerOrder createOrder(Cart cart) {
		return customerOrderDao.createOrder(cart);
	}

}
