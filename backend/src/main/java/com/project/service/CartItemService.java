package com.project.service;

import com.project.model.Cart;
import com.project.model.CartItem;

public interface CartItemService {
	void addCartItem(CartItem cartItem);
	void removeCartItem(int CartItemId);
	public void removeAllCartItem(int cartId);
	public Cart getCart(int cartId);
}
