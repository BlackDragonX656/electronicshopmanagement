package com.cogent.boot.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Purchase {
	@Id
	@Column
	private int id;
	@Column
	private String productName;
	@Column
	private double cost;
	@Column
	private Date dateOfPurchase;
	@Column
	private Date deliveryDate;
	@Column
	private String feedback;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public Purchase(int id, String productName, double cost, Date dateOfPurchase, Date deliveryDate, String feedback) {
		super();
		this.id = id;
		this.productName = productName;
		this.cost = cost;
		this.dateOfPurchase = dateOfPurchase;
		this.deliveryDate = deliveryDate;
		this.feedback = feedback;
	}
	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Purchase [id=" + id + ", productName=" + productName + ", cost=" + cost + ", dateOfPurchase="
				+ dateOfPurchase + ", deliveryDate=" + deliveryDate + ", feedback=" + feedback + "]";
	}
	
	
}
