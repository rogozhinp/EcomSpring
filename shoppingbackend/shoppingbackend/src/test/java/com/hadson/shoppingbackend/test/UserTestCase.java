package com.hadson.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hadson.shoppingbackend.dao.UserDAO;
import com.hadson.shoppingbackend.dto.Address;
import com.hadson.shoppingbackend.dto.Cart;
import com.hadson.shoppingbackend.dto.User;

public class UserTestCase {

	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private User user = null;
	private Cart cart = null;
	private Address address = null;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.hadson.shoppingbackend");
		context.refresh();

		userDAO = (UserDAO) context.getBean("userDAO");
	}

//	@Test
//	public void testAddUser() {
//
//		user = new User();
//		user.setFirstName("Daniel");
//		user.setLastName("Kreig");
//		user.setEmail("kreig@mail.ru");
//		user.setContactNumber("1235678234");
//		user.setRole("USER");
//		user.setPassword("12345");
//
//		// add the user
//		assertEquals("Failed to add user!", true, userDAO.add(user));
//
//		address = new Address();
//		address.setAddressLineOne("New Yourk, 145 avenu, 54 appartment");
//		address.setAddressLineTwo("Near Times Squar");
//		address.setCity("New-York");
//		address.setState("New-York");
//		address.setCountry("USA");
//		address.setPostalCode("10001");
//		address.setBilling(true);
//
//		// link the user with the address using user id
//
//		address.setUserId(user.getId());
//
//		// add the address
//		assertEquals("Failed to add address!", true, userDAO.addAddress(address));
//
//		if (user.getRole().equals("USER")) {
//			// create a cart for this user
//			cart = new Cart();
//			cart.setUser(user);
//
//			// add the cart
//			assertEquals("Failed to add cart!", true, userDAO.addCart(cart));
//
//			// add a shipping address for this user
//			address = new Address();
//			address.setAddressLineOne("New Yourk, 145 avenu, 54 appartment");
//			address.setAddressLineTwo("Near Times Squar");
//			address.setCity("New-York");
//			address.setState("New-York");
//			address.setCountry("USA");
//			address.setPostalCode("10001");
//			// set shipping to true
//			address.setShipping(true);
//
//			// link it with the user
//			address.setUserId(user.getId());
//
//			// add the shipping address
//			assertEquals("Failed to add shipping address!", true, userDAO.addAddress(address));
//		}
//
//	}

//	@Test
//	public void testUpdateCart() {
//		// fetch the user by its email
//		user = userDAO.getByEmail("kreig@mail.ru");
//
//		// get the cart of the user
//		cart = user.getCart();
//
//		cart.setGrandTotal(55555);
//
//		cart.setCartLines(2);
//
//		assertEquals("Failed to update the cart!", true, userDAO.updateCart(cart));
//
//	}

//	@Test
//	public void testAddAddress() {
//		// add user
//		user = new User();
//		user.setFirstName("Daniel");
//		user.setLastName("Kreig");
//		user.setEmail("kreig@mail.ru");
//		user.setContactNumber("1235678234");
//		user.setRole("USER");
//		user.setPassword("12345");
//
//		assertEquals("Failed to add user!", true, userDAO.add(user));
//
//		// add address
//		address = new Address();
//		address.setAddressLineOne("New Yourk, 145 avenu, 54 appartment");
//		address.setAddressLineTwo("Near Times Squar");
//		address.setCity("New-York");
//		address.setState("New-York");
//		address.setCountry("USA");
//		address.setPostalCode("10001");
//		address.setBilling(true);
//
//		// attached the user to the address
//		address.setUser(user);
//
//		assertEquals("Failed to add address!", true, userDAO.addAddress(address));
//
//		// add shipping adress
//		address = new Address();
//		address.setAddressLineOne("New Yourk, 145 avenu, 54 appartment");
//		address.setAddressLineTwo("Near Times Squar");
//		address.setCity("New-York");
//		address.setState("New-York");
//		address.setCountry("USA");
//		address.setPostalCode("10001");
//		// set shipping to true
//		address.setShipping(true);
//
//		// attached the address with the user
//		address.setUser(user);
//
//		// add the shipping address
//		assertEquals("Failed to add shipping address!", true, userDAO.addAddress(address));
//
//	}

//	@Test
//	public void testAddAddress() {
//
//		user = userDAO.getByEmail("kreig@mail.ru");
//
//		// add address
//		address = new Address();
//		address.setAddressLineOne("New Yourk, 148 avenu, 35 appartment");
//		address.setAddressLineTwo("Manhattan");
//		address.setCity("New-York");
//		address.setState("New-York");
//		address.setCountry("USA");
//		address.setPostalCode("10066");
//		address.setBilling(true);
//		address.setShipping(true);
//
//		// attached the user to the address
//		address.setUser(user);
//
//		assertEquals("Failed to add shipping address!", true, userDAO.addAddress(address));
//	}

	@Test
	public void testGetAddresses() {
		user = userDAO.getByEmail("kreig@mail.ru");

		assertEquals("Failed to fetch the list of addresses and size does not match", 2,
				userDAO.listShippingAddresses(user).size());
	}

}
