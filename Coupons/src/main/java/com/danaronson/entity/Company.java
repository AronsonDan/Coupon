package com.danaronson.entity;

import java.util.List;

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
@Table(name="company")
@Transactional
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
    private long id;
	
	@Column(name="COMP_NAME")
    private String compName;
	
	@Column(name="PASSWORD")
    private String password;
	
	@Column(name="EMAIL")
    private String email;
	
	@OneToMany
	@JoinTable(name="company_coupon", joinColumns=@JoinColumn(name="Company_ID"), inverseJoinColumns=@JoinColumn(name="Coupon_ID"))
    private List<Coupon> coupons;

	/**********************************************/
	/************** Constructors ******************/
	/**********************************************/
	
    public Company() {

	}
        
    public Company(String compName, String password, String email, List<Coupon> coupons) {
		this.compName = compName;
		this.password = password;
		this.email = email;
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

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
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
		result = prime * result + ((compName == null) ? 0 : compName.hashCode());
		result = prime * result + ((coupons == null) ? 0 : coupons.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
    public boolean equals(Object obj) {
	return this.getCompName().equals(((Company)obj).getCompName());
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [id=" + id + ", compName=" + compName + ", password=" + password + ", email=" + email
				+ ", coupons=" + coupons + "]";
	}


		
}