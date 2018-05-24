package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Warehouse entity. @author MyEclipse Persistence Tools
 */

public class Warehouse implements java.io.Serializable {

	// Fields

	private Integer warehouseId;
	private Branch branch;
	private Emp emp;
	private String warehouseName;
	private String warehouseAdress;
	private Integer warehouseArea;
	private Integer rent;
	private Set repertories = new HashSet(0);

	// Constructors

	/** default constructor */
	public Warehouse() {
	}

	/** full constructor */
	public Warehouse(Branch branch, Emp emp, String warehouseName, String warehouseAdress, Integer warehouseArea,
			Integer rent, Set repertories) {
		this.branch = branch;
		this.emp = emp;
		this.warehouseName = warehouseName;
		this.warehouseAdress = warehouseAdress;
		this.warehouseArea = warehouseArea;
		this.rent = rent;
		this.repertories = repertories;
	}

	// Property accessors

	public Integer getWarehouseId() {
		return this.warehouseId;
	}

	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Emp getEmp() {
		return this.emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public String getWarehouseName() {
		return this.warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getWarehouseAdress() {
		return this.warehouseAdress;
	}

	public void setWarehouseAdress(String warehouseAdress) {
		this.warehouseAdress = warehouseAdress;
	}

	public Integer getWarehouseArea() {
		return this.warehouseArea;
	}

	public void setWarehouseArea(Integer warehouseArea) {
		this.warehouseArea = warehouseArea;
	}

	public Integer getRent() {
		return this.rent;
	}

	public void setRent(Integer rent) {
		this.rent = rent;
	}

	public Set getRepertories() {
		return this.repertories;
	}

	public void setRepertories(Set repertories) {
		this.repertories = repertories;
	}

}