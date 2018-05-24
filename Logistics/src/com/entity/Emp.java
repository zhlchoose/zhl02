package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Integer empId;
	private String empName;
	private String empSex;
	private String empPhone;
	private String empEmil;
	private String empCard;
	private String empAdress;
	private String empBei;
	private Integer deptId;
	private Integer positionId;
	private Integer accountId;
	private Set waybills = new HashSet(0);
	private Set branchs = new HashSet(0);
	private Set warehouses = new HashSet(0);
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** full constructor */
	public Emp(String empName, String empSex, String empPhone, String empEmil, String empCard, String empAdress,
			String empBei, Integer deptId, Integer positionId, Integer accountId, Set waybills, Set branchs,
			Set warehouses, Set orders) {
		this.empName = empName;
		this.empSex = empSex;
		this.empPhone = empPhone;
		this.empEmil = empEmil;
		this.empCard = empCard;
		this.empAdress = empAdress;
		this.empBei = empBei;
		this.deptId = deptId;
		this.positionId = positionId;
		this.accountId = accountId;
		this.waybills = waybills;
		this.branchs = branchs;
		this.warehouses = warehouses;
		this.orders = orders;
	}

	// Property accessors

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSex() {
		return this.empSex;
	}

	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}

	public String getEmpPhone() {
		return this.empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpEmil() {
		return this.empEmil;
	}

	public void setEmpEmil(String empEmil) {
		this.empEmil = empEmil;
	}

	public String getEmpCard() {
		return this.empCard;
	}

	public void setEmpCard(String empCard) {
		this.empCard = empCard;
	}

	public String getEmpAdress() {
		return this.empAdress;
	}

	public void setEmpAdress(String empAdress) {
		this.empAdress = empAdress;
	}

	public String getEmpBei() {
		return this.empBei;
	}

	public void setEmpBei(String empBei) {
		this.empBei = empBei;
	}

	public Integer getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getPositionId() {
		return this.positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Set getWaybills() {
		return this.waybills;
	}

	public void setWaybills(Set waybills) {
		this.waybills = waybills;
	}

	public Set getBranchs() {
		return this.branchs;
	}

	public void setBranchs(Set branchs) {
		this.branchs = branchs;
	}

	public Set getWarehouses() {
		return this.warehouses;
	}

	public void setWarehouses(Set warehouses) {
		this.warehouses = warehouses;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}