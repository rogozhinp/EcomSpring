package com.hadson.onlineshopping.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hadson.onlineshopping.model.UserModel;
import com.hadson.shoppingbackend.dao.CartLineDAO;
import com.hadson.shoppingbackend.dto.Cart;
import com.hadson.shoppingbackend.dto.CartLine;

@Service("cartService")
public class CartService {

	@Autowired
	private CartLineDAO cartLineDAO;

	@Autowired
	private HttpSession session;

	// returns the cart of the user who has logged in
	private Cart getCart() {

		return ((UserModel) session.getAttribute("userModel")).getCart();

	}

	// returns the entire cart lines
	public List<CartLine> getCartLines() {

		return cartLineDAO.list(this.getCart().getId());

	}

}
