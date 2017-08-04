package com.project.dao;

import com.project.model.CartItem;

public interface CartItemDAO {
	void addCartItem(CartItem cartItem);
	void removeCartItem(int CartItemId);
	public void removeAllCartItem(int cartId);
}
