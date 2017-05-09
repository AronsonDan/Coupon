package com.danaronson.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author Dan Aronson
 *
 */
@Entity
@Table(name="customer")
@Transactional
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
    private long id;
	
	@Column(name="CUST_NAME")
    private String custName;
	
	@Column(name="PASSWORD")
    private String password;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="customer_coupon", joinColumns=@JoinColumn(name="Cust_ID"), inverseJoinColumns=@JoinColumn(name="Coupon_ID"))
    private Collection<Coupon> coupons;

	/**********************************************/
	/************** Constructors ******************/
	/**********************************************/
	
    public Customer() {

	}

    public Customer(String custName, String password, Collection<Coupon> coupons) {
		super();
		this.custName = custName;
		this.password = password;
		this.coupons = coupons;
	}
    
	/*****************************************************/
	/************** Getters And Setters ******************/
	/*****************************************************/
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(Collection<Coupon> coupons) {
		this.coupons = coupons;
	}

	/****************************************************************/
	/************** Equals & toString and hashCode ******************/
	/****************************************************************/
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coupons == null) ? 0 : coupons.hashCode());
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
    public boolean equals(Object obj) {
	return this.getCustName().equals(((Customer)obj).getCustName());
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [id=" + id + ", custName=" + custName + ", password=" + password + ", coupons=" + coupons
				+ "]";
	}
	
	

    
}

