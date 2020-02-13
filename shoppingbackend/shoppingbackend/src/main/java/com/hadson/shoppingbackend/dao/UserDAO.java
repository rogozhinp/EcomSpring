package com.hadson.shoppingbackend.dao;

import java.util.List;

import com.hadson.shoppingbackend.dto.Address;
import com.hadson.shoppingbackend.dto.Cart;
import com.hadson.shoppingbackend.dto.User;

public interface UserDAO {

	// user related operation
	User getByEmail(String email);

	User get(int id);

	boolean add(User user);

	boolean addCart(Cart cart);

	// adding and updating a new address
	Address getAddress(int addressId);

	boolean addAddress(Address address);

	boolean updateAddress(Address address);

	Address getBillingAddress(int userId);

	List<Address> listShippingAddresses(int userId);

}
