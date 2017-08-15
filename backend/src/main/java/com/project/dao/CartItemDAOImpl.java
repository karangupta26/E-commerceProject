package com.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.Cart;
import com.project.model.CartItem;
@Repository
public class CartItemDAOImpl implements CartItemDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public void addCartItem(CartItem cartItem) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(cartItem);		
	}

	public void removeCartItem(int CartItemId) {
		Session session=sessionFactory.getCurrentSession();
		CartItem cartItem=(CartItem)session.get(CartItem.class ,CartItemId  );
		session.delete(cartItem);
	}

	public void removeAllCartItem(int cartId) {
		Session session=sessionFactory.getCurrentSession();
		Cart cart=(Cart)session.get(Cart.class,cartId);
		List<CartItem> cartItems=cart.getCartItems();
		for(CartItem cartItem:cartItems){
			session.delete(cartItem);
		}
		
	}

	public Cart getcart(int cartId) {
		Session session=sessionFactory.getCurrentSession();
		Cart cart=(Cart)session.get(Cart.class,cartId); 
		return cart;
	}

}
