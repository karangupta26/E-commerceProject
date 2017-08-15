package com.project.dao;

import com.project.model.Cart;
import com.project.model.CustomerOrder;

public interface CustomerOrderDAO {
	CustomerOrder createOrder(Cart cart);
}
