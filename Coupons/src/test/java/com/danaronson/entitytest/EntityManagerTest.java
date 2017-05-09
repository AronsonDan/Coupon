package com.danaronson.entitytest;
 

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.danaronson.entity.Company;
import com.danaronson.entity.Coupon;
import com.danaronson.entity.Customer;
import com.danaronson.enums.CouponType;
 
/**
 * This program demonstrates how to use JPA annotations to map
 * a one-to-many association on join table in Hibernate.
 * @author www.codejava.net
 *
 */
public class EntityManagerTest {
	

 
    public static void main(String[] args) {
    	
    	Calendar c = Calendar.getInstance();
    	long timestamp = c.getTimeInMillis();
    	Date date = new Date(timestamp);
    	
    	List<Coupon> coupons = new ArrayList<Coupon>();
    	
		// Create Session Factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Coupon.class)
				.addAnnotatedClass(Customer.class)
				.addAnnotatedClass(Company.class)
				.buildSessionFactory();
		// Create Session
		Session session = factory.getCurrentSession();
 

        
        // Create an array list of coupons
        Coupon coupon1 = new Coupon("Coupon1", date, date, 10, CouponType.CAMPING, "message", 10.10, "image");
        Coupon coupon2 = new Coupon("Coupon2", date, date, 20, CouponType.CAMPING, "message", 10.10, "image");
        Coupon coupon3 = new Coupon("Coupon3", date, date, 30, CouponType.CAMPING, "message", 10.10, "image");
        
        session = factory.openSession();
        session.beginTransaction();


        session.save(coupon1);
        session.save(coupon2);
        session.save(coupon3);
 
        session.getTransaction().commit();
        session.close();
        
        coupons.add(coupon1);
        coupons.add(coupon2);
        coupons.add(coupon3);
        
        // Create a Company
        Company company = new Company("KPMG", "1234", "KPMG@KPMG.com", coupons);

        // Create a Customer
        Customer customer = new Customer("Customer","1234567890" , coupons);

        // obtains the session
        session = factory.openSession();
        session.beginTransaction();


        session.save(company);
 
        session.getTransaction().commit();
        session.close();
        
        session = factory.openSession();
        session.beginTransaction();


        session.save(customer);
 
        session.getTransaction().commit();
        session.close();
    }
 
}