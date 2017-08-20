package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.model.Cart;
import com.project.model.Customer;
import com.project.model.CustomerOrder;
import com.project.model.ShippingAddress;
import com.project.service.CartItemService;
import com.project.service.CustomerOrderService;

@Controller
public class CustomerOrderController {
	@Autowired
	private CustomerOrderService customerOrderService;
	@Autowired
	private CartItemService cartItemService;
	@RequestMapping(value="/cart/shippingaddressform/{cartId}")
	public String getShippingAddress(@PathVariable int cartId,Model model){
		Cart cart=cartItemService.getCart(cartId);
		Customer customer=cart.getCustomer();
		model.addAttribute("shippingAddress", customer.getShippingAddress());
		model.addAttribute("cartId", cartId);
		return "ShippingForm";
	}
	@RequestMapping(value="/cart/order/{cartId}")
	public String createOrder(@PathVariable int cartId,@ModelAttribute ShippingAddress shippingAddress,Model model){
		Cart cart=cartItemService.getCart(cartId);
		Customer customer=cart.getCustomer();
		customer.setShippingAddress(shippingAddress);
		cart.setCustomer(customer);
		CustomerOrder customerOrder=customerOrderService.createOrder(cart);
		model.addAttribute("customerOrder",customerOrder);
		model.addAttribute("cartId", cartId);
		return "OrderDetails";
	}
	@RequestMapping(value="/cart/confirm/{cartId}")
	public String confirmOrder(@ModelAttribute CustomerOrder customerOrder,@PathVariable int cartId){
		cartItemService.removeAllCartItem(cartId);
		return "Confirmed";
	}
}
