package com.hadson.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hadson.shoppingbackend.dao.CartLineDAO;
import com.hadson.shoppingbackend.dao.ProductDAO;
import com.hadson.shoppingbackend.dao.UserDAO;
import com.hadson.shoppingbackend.dto.Cart;
import com.hadson.shoppingbackend.dto.CartLine;
import com.hadson.shoppingbackend.dto.Product;
import com.hadson.shoppingbackend.dto.User;

public class CartLineTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CartLineDAO cartLineDAO = null;
	private static ProductDAO productDAO = null;
	private static UserDAO userDAO = null;

	private CartLine cartLine = null;

	private Product product = null;
	private User user = null;
	private Cart cart = null;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.hadson.shoppingbackend");
		context.refresh();
		cartLineDAO = (CartLineDAO) context.getBean("cartLineDAO");
		productDAO = (ProductDAO) context.getBean("productDAO");
		userDAO = (UserDAO) context.getBean("userDAO");
	}

	@Test
	public void testAddNewCartLine() {

		// 1.get the particular user
		user = userDAO.getByEmail("admin@mail.ru");

		// 2. fetch the cart
		cart = user.getCart();

		// 3. get the product
		product = productDAO.get(1);

		// 4. create a new cartline
		cartLine = new CartLine();

		cartLine.setBuyingPrice(product.getUnitPrice());

		cartLine.setProductCount(cartLine.getProductCount() + 1);

		cartLine.setTotal(cartLine.getProductCount() * product.getUnitPrice());

		cartLine.setAvailable(true);

		cartLine.setCartId(cart.getId());

		cartLine.setProduct(product);

		assertEquals("Failed to add the cartLine", true, cartLineDAO.add(cartLine));

		// update the cart

		cart.setGrandTotal(cart.getGrandTotal() + cartLine.getTotal());
		cart.setCartLines(cart.getCartLines() + 1);
		assertEquals("Failed to update the cartLine", true, cartLineDAO.updateCart(cart));
	}

}
