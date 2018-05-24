package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Pickingway entity. @author MyEclipse Persistence Tools
 */

public class Pickingway implements java.io.Serializable {

	// Fields

	private Integer pickingWayId;
	private String pickingWayName;
	private Set waybills = new HashSet(0);
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Pickingway() {
	}

	/** full constructor */
	public Pickingway(String pickingWayName, Set waybills, Set orders) {
		this.pickingWayName = pickingWayName;
		this.waybills = waybills;
		this.orders = orders;
	}

	// Property accessors

	public Integer getPickingWayId() {
		return this.pickingWayId;
	}

	public void setPickingWayId(Integer pickingWayId) {
		this.pickingWayId = pickingWayId;
	}

	public String getPickingWayName() {
		return this.pickingWayName;
	}

	public void setPickingWayName(String pickingWayName) {
		this.pickingWayName = pickingWayName;
	}

	public Set getWaybills() {
		return this.waybills;
	}

	public void setWaybills(Set waybills) {
		this.waybills = waybills;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}