package com.project.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.model.Cart;
import com.project.model.CartItem;
import com.project.model.Customer;
import com.project.model.Product;
import com.project.service.CartItemService;
import com.project.service.CustomerService;
import com.project.service.ProductService;

@Controller
public class CartItemController {
	@Autowired
	private ProductService productservice;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private CartItemService cartItemService;
	@RequestMapping(value="/cart/addToCart/{id}")
	public String addCartItem(@PathVariable int id,@RequestParam int units,Model model){
		Product product=productservice.getProductById(id);
		User user=(User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username=user.getUsername();
		Customer customer=customerService.getCustomerByusername(username);
		if(customer==null){
			Product productError=productservice.getProductById(id);
			String message="Login as Customer!";
			model.addAttribute("productDetails", productError);
			model.addAttribute("errorMessage", message);
			return "ViewProduct";
		}
		
		Cart cart=customer.getCart();
		List<CartItem> cartItems=cart.getCartItems();
		System.out.println(cart.getCartItems().size());
		//Checking for the purchased product
		for(CartItem cartItem:cartItems){
			System.out.println(cartItem.getProduct().getPid());
			System.out.println(id);
			if(cartItem.getProduct().getPid()==id){
				cartItem.setQuantity(units);
				cartItem.setTotalPrice(product.getPrice()*units); 
				cartItemService.addCartItem(cartItem);
				return "redirect:/cart/getcart";
			}
		}
		CartItem cartItem=new CartItem();
		cartItem.setQuantity(units);
		cartItem.setTotalPrice(product.getPrice()*units);
		cartItem.setProduct(product);
		cartItem.setCart(cart);
		cartItemService.addCartItem(cartItem);
		
		return "redirect:/cart/getcart";
	 }
	@RequestMapping(value="/cart/getcart")
	public String getCart(Model model){
		User user=(User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username=user.getUsername();
		System.out.println(username);
		Customer customer=customerService.getCustomerByusername(username);
		Cart cart=customer.getCart();
		model.addAttribute("getCart", cart);
		return "Cart";
	}
	@RequestMapping(value="/cart/removeCartItem/{cartItemId}")
	public String removeCartItem(@PathVariable int cartItemId){
		cartItemService.removeCartItem(cartItemId);
		return "redirect:/cart/getcart";
	}
	@RequestMapping(value="/cart/clearcart/{cartId}")
	public String removeAllcartItem(@PathVariable int cartId){
		cartItemService.removeAllCartItem(cartId);
		return "redirect:/cart/getcart";
	}

}