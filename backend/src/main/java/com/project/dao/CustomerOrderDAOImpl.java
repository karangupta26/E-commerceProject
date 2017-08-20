package com.project.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.Cart;
import com.project.model.CartItem;
import com.project.model.Customer;
import com.project.model.CustomerOrder;
import com.project.model.Product;
import com.project.service.ProductService;
@Repository
public class CustomerOrderDAOImpl implements CustomerOrderDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private ProductService productService;
	public CustomerOrder createOrder(Cart cart) {
		Session session=sessionFactory.getCurrentSession();
		List<CartItem> cartItems=cart.getCartItems();
		double grandTotal=0;
		for(CartItem cartItem:cartItems){
			grandTotal=cartItem.getTotalPrice()+grandTotal;
		}
		cart.setGrandTotal(grandTotal);
		Customer customer=cart.getCustomer();
		CustomerOrder customerOrder=new CustomerOrder();
		customerOrder.setPurchaseDate(new Date());
		customerOrder.setCart(cart);
		customerOrder.setCustomer(customer);
		customerOrder.setBillingAddress(customer.getBillingAddress());
		customerOrder.setShippingAddress(customer.getShippingAddress());
		for(CartItem cartItem:cartItems){
			Product product=cartItem.getProduct();
			int quantity=cartItem.getQuantity();
			System.out.println(quantity);
			int id=product.getPid();
			Product productUpdate=productService.getProductById(id);
			System.out.println(productUpdate.getQty());
			int newqty=productUpdate.getQty()-quantity;
			System.out.println(newqty);
			productUpdate.setQty(newqty);
			session.saveOrUpdate(productUpdate);
		}		
		
		session.save(customerOrder);
		return customerOrder;
	}

}
