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

	@Test
	public void testAddUser() {

		user = new User();
		user.setFirstName("Daniel");
		user.setLastName("Kreig");
		user.setEmail("kreig@mail.ru");
		user.setContactNumber("1235678234");
		user.setRole("USER");
		user.setPassword("12345");

		// add the user
		assertEquals("Failed to add user!", true, userDAO.add(user));

		address = new Address();
		address.setAddressLineOne("New Yourk, 145 avenu, 54 appartment");
		address.setAddressLineTwo("Near Times Squar");
		address.setCity("New-York");
		address.setState("New-York");
		address.setCountry("USA");
		address.setPostalCode("10001");
		address.setBilling(true);

		// link the user with the address using user id

		address.setUserId(user.getId());

		// add the address
		assertEquals("Failed to add address!", true, userDAO.addAddress(address));

		if (user.getRole().equals("USER")) {
			// create a cart for this user
			cart = new Cart();
			cart.setUser(user);

			// add the cart
			assertEquals("Failed to add cart!", true, userDAO.addCart(cart));

			// add a shipping address for this user
			address = new Address();
			address.setAddressLineOne("New Yourk, 145 avenu, 54 appartment");
			address.setAddressLineTwo("Near Times Squar");
			address.setCity("New-York");
			address.setState("New-York");
			address.setCountry("USA");
			address.setPostalCode("10001");
			// set shipping to true
			address.setShipping(true);

			// link it with the user
			address.setUserId(user.getId());

			// add the shipping address
			assertEquals("Failed to add shipping address!", true, userDAO.addAddress(address));
		}

	}
}
