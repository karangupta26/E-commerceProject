package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.CartItemDAO;
import com.project.model.Cart;
import com.project.model.CartItem;
@Service
@Transactional
public class CartItemServiceImpl implements CartItemService{
	@Autowired
	private CartItemDAO cartItemDao;
	public void addCartItem(CartItem cartItem) {
		cartItemDao.addCartItem(cartItem);
		
	}

	public void removeCartItem(int CartItemId) {
		cartItemDao.removeCartItem(CartItemId);
		
	}

	public void removeAllCartItem(int cartId) {
		cartItemDao.removeAllCartItem(cartId);
		
	}

	public Cart getCart(int cartId) {
		return cartItemDao.getcart(cartId);
	}
	
}
