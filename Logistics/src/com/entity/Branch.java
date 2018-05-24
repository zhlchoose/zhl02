package com.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Branch entity. @author MyEclipse Persistence Tools
 */

public class Branch implements java.io.Serializable {

	// Fields

	private Integer branchId;
	private Emp emp;
	private String branchName;
	private String branchAddress;
	private String branchContact;
	private Date branchDate;
	private Set warehouses = new HashSet(0);
	private Set waybills = new HashSet(0);
	private Set orders = new HashSet(0);
	private Set repertories = new HashSet(0);

	// Constructors

	/** default constructor */
	public Branch() {
	}

	/** full constructor */
	public Branch(Emp emp, String branchName, String branchAddress, String branchContact, Date branchDate,
			Set warehouses, Set waybills, Set orders, Set repertories) {
		this.emp = emp;
		this.branchName = branchName;
		this.branchAddress = branchAddress;
		this.branchContact = branchContact;
		this.branchDate = branchDate;
		this.warehouses = warehouses;
		this.waybills = waybills;
		this.orders = orders;
		this.repertories = repertories;
	}

	// Property accessors

	public Integer getBranchId() {
		return this.branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public Emp getEmp() {
		return this.emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchAddress() {
		return this.branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getBranchContact() {
		return this.branchContact;
	}

	public void setBranchContact(String branchContact) {
		this.branchContact = branchContact;
	}

	public Date getBranchDate() {
		return this.branchDate;
	}

	public void setBranchDate(Date branchDate) {
		this.branchDate = branchDate;
	}

	public Set getWarehouses() {
		return this.warehouses;
	}

	public void setWarehouses(Set warehouses) {
		this.warehouses = warehouses;
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

	public Set getRepertories() {
		return this.repertories;
	}

	public void setRepertories(Set repertories) {
		this.repertories = repertories;
	}

}