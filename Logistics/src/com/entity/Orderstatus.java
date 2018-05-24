package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Orderstatus entity. @author MyEclipse Persistence Tools
 */

public class Orderstatus implements java.io.Serializable {

	// Fields

	private Integer orderStatusId;
	private String orderStatusName;
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orderstatus() {
	}

	/** full constructor */
	public Orderstatus(String orderStatusName, Set orders) {
		this.orderStatusName = orderStatusName;
		this.orders = orders;
	}

	// Property accessors

	public Integer getOrderStatusId() {
		return this.orderStatusId;
	}

	public void setOrderStatusId(Integer orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

	public String getOrderStatusName() {
		return this.orderStatusName;
	}

	public void setOrderStatusName(String orderStatusName) {
		this.orderStatusName = orderStatusName;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}