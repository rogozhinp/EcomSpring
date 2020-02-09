package com.hadson.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hadson.shoppingbackend.dao.CategoryDAO;
import com.hadson.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.hadson.shoppingbackend");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	@Test
	public void testListCategory() {

		assertEquals("Successfully fetched the list of categories from the table!", 5, categoryDAO.list().size());
	}

//	@Test
//	public void testDeleteCategory() {
//
//		category = categoryDAO.get(2);
//		assertEquals("Successfully deleted a single category in the table!", true, categoryDAO.delete(category));
//	}

//	@Test
//	public void testUpdateCategory() {
//
//		category = categoryDAO.get(2);
//		category.setName("TV");
//		assertEquals("Successfully updated a single category in the table!", true, categoryDAO.update(category));
//	}

//	@Test
//	public void testAddCategory() {
//
//		category = new Category();
//
//		category.setName("Boilers");
//		category.setDescription("Description for boilers category");
//		category.setImageURL("CAT_7.png");
//		assertEquals("Successfully added a category inside the table", true, categoryDAO.add(category));
//
//	}

	/*
	 * @Test public void testGetCategory() {
	 * 
	 * category = categoryDAO.get(2);
	 * assertEquals("Successfully fetched a single category from the table!",
	 * "Television", category.getName()); }
	 */

}
