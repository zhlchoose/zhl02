package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Waybilltype entity. @author MyEclipse Persistence Tools
 */

public class Waybilltype implements java.io.Serializable {

	// Fields

	private Integer waybillTypeId;
	private String waybillTypeName;
	private Set waybills = new HashSet(0);

	// Constructors

	/** default constructor */
	public Waybilltype() {
	}

	/** full constructor */
	public Waybilltype(String waybillTypeName, Set waybills) {
		this.waybillTypeName = waybillTypeName;
		this.waybills = waybills;
	}

	// Property accessors

	public Integer getWaybillTypeId() {
		return this.waybillTypeId;
	}

	public void setWaybillTypeId(Integer waybillTypeId) {
		this.waybillTypeId = waybillTypeId;
	}

	public String getWaybillTypeName() {
		return this.waybillTypeName;
	}

	public void setWaybillTypeName(String waybillTypeName) {
		this.waybillTypeName = waybillTypeName;
	}

	public Set getWaybills() {
		return this.waybills;
	}

	public void setWaybills(Set waybills) {
		this.waybills = waybills;
	}

}