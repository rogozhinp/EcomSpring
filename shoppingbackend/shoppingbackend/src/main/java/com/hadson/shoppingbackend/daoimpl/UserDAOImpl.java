package com.hadson.shoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hadson.shoppingbackend.dao.UserDAO;
import com.hadson.shoppingbackend.dto.Address;
import com.hadson.shoppingbackend.dto.Cart;
import com.hadson.shoppingbackend.dto.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean add(User user) {
		try {
			sessionFactory.getCurrentSession().persist(user);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean addAddress(Address address) {
		try {
			// will look for this code later and why we need to change it
			sessionFactory.getCurrentSession().persist(address);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean updateCart(Cart cart) {
		try {
			sessionFactory.getCurrentSession().update(cart);
			return true;
		} catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public User getByEmail(String email) {
		String selectQuery = "FROM User WHERE email = :email";
		try {

			return sessionFactory.getCurrentSession().createQuery(selectQuery, User.class).setParameter("email", email)
					.getSingleResult();

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;

		}
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getAddress(int addressId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateAddress(Address address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Address getBillingAddress(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> listShippingAddresses(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
