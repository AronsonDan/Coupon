/**
 * 
 */
package com.danaronson.dao;

import java.util.List;

import com.danaronson.entity.Coupon;
import com.danaronson.enums.CouponType;
import com.danaronson.exceptions.CouponException;

/**
 * @author Dan Aronson
 *
 */
public interface CouponDAO {

    public void createCoupon(Coupon coupon) throws CouponException;

    public void removeCoupon(Coupon coupon) throws CouponException;

    public void updateCoupon(Coupon coupon) throws CouponException;

    public Coupon getCoupon(Coupon coupon) throws CouponException;

    public List<Coupon> getAllCoupon() throws CouponException;

    public List<Coupon> getCouponByType(CouponType coupontype) throws CouponException;
}
