package com.danaronson.dao;

import java.util.List;

import com.danaronson.entity.Coupon;
import com.danaronson.entity.Customer;
import com.danaronson.exceptions.CouponException;
import com.danaronson.exceptions.CustomerException;

/**
 * @author Dan Aronson
 *
 */
public interface CustomerDAO {

public void createCustomer(Customer customer) throws CustomerException;

	public void removeCustomer(Customer customer) throws CustomerException;

	public void updateCustomer(Customer customer) throws CustomerException;

	public Customer getCustomer(long id) throws CustomerException;

	public List<Customer> getAllCustomer() throws CustomerException;

	public List<Coupon> getCoupons(Customer customer) throws CustomerException, CouponException;

	public boolean login(String custName, String password) throws CustomerException;
}
