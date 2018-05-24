package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Ordertype entity. @author MyEclipse Persistence Tools
 */

public class Ordertype implements java.io.Serializable {

	// Fields

	private Integer orderTypeId;
	private String orderTypeName;
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Ordertype() {
	}

	/** full constructor */
	public Ordertype(String orderTypeName, Set orders) {
		this.orderTypeName = orderTypeName;
		this.orders = orders;
	}

	// Property accessors

	public Integer getOrderTypeId() {
		return this.orderTypeId;
	}

	public void setOrderTypeId(Integer orderTypeId) {
		this.orderTypeId = orderTypeId;
	}

	public String getOrderTypeName() {
		return this.orderTypeName;
	}

	public void setOrderTypeName(String orderTypeName) {
		this.orderTypeName = orderTypeName;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}