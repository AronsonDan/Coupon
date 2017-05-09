package com.danaronson.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;

import com.danaronson.enums.CouponType;



/**
 *
 */
@Entity
@Table(name="coupon")
@Transactional
public class Coupon {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
    private long id;
	
	@Column(name="TITLE")
    private String title;
	
	@Column(name="START_DATE")
    private Date startDate;
	
	@Column(name="END_DATE")
    private Date endDate;
	
	@Column(name="AMOUNT")
    private int amount;
	
	@Column(name="TYPE")
    private CouponType type;
	
	@Column(name="MESSAGE")
    private String message;
	
	@Column(name="PRICE")
    private double price;
	
	@Column(name="IMAGE")
    private String image;

	
	/**********************************************/
	/************** Constructors ******************/
	/**********************************************/
    public Coupon() {

	}
    
    public Coupon(String title, Date startDate, Date endDate, int amount, CouponType type,
			String message, double price, String image) {
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.type = type;
		this.message = message;
		this.price = price;
		this.image = image;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public CouponType getType() {
		return type;
	}

	public void setType(CouponType type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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
		result = prime * result + amount;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
    public boolean equals(Object obj) {
	return this.getTitle().equals(((Coupon)obj).getTitle());
    }




    
}