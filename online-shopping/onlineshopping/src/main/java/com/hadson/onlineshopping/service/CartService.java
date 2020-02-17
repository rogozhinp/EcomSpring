package com.hadson.onlineshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hadson.shoppingbackend.dao.CartLineDAO;

@Service("cartService")
public class CartService {

	@Autowired
	private CartLineDAO cartLineDAO;

}
