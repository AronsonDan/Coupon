/**
 * 
 */
package com.danaronson.dao;

import java.util.List;

import com.danaronson.entity.Company;
import com.danaronson.entity.Coupon;
import com.danaronson.exceptions.CompanyException;
import com.danaronson.exceptions.CouponException;

/**
 * @author Dan Aronson
 *
 */
public interface CompanyDAO {

    public void createCompany(Company company) throws CompanyException, CouponException;

    public void removeCompany(Company company) throws CompanyException, CouponException;

    public void updateCompany(Company company) throws CompanyException, CouponException;

    public Company getCompany(long id) throws CompanyException, CouponException;

    public List<Company> getAllCompanies() throws CompanyException, CouponException;

    public List<Coupon> getCoupons(Company company) throws CompanyException, CouponException;

    public boolean login(String compName, String password) throws CompanyException;

}
