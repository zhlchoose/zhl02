package com.entity;

import java.util.Date;

/**
 * Repertory entity. @author MyEclipse Persistence Tools
 */

public class Repertory implements java.io.Serializable {

	// Fields

	private Integer repertoryId;
	private Branch branch;
	private Warehouse warehouse;
	private Order order;
	private String cargoName;
	private Date repertoryTime;
	private String repertoryState;
	private Double repertoryVolume;
	private String fromStand;
	private String toStand;
	private String route;
	private String consigner;
	private String consignee;
	private String remarks;

	// Constructors

	/** default constructor */
	public Repertory() {
	}

	/** full constructor */
	public Repertory(Branch branch, Warehouse warehouse, Order order, String cargoName, Date repertoryTime,
			String repertoryState, Double repertoryVolume, String fromStand, String toStand, String route,
			String consigner, String consignee, String remarks) {
		this.branch = branch;
		this.warehouse = warehouse;
		this.order = order;
		this.cargoName = cargoName;
		this.repertoryTime = repertoryTime;
		this.repertoryState = repertoryState;
		this.repertoryVolume = repertoryVolume;
		this.fromStand = fromStand;
		this.toStand = toStand;
		this.route = route;
		this.consigner = consigner;
		this.consignee = consignee;
		this.remarks = remarks;
	}

	// Property accessors

	public Integer getRepertoryId() {
		return this.repertoryId;
	}

	public void setRepertoryId(Integer repertoryId) {
		this.repertoryId = repertoryId;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Warehouse getWarehouse() {
		return this.warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getCargoName() {
		return this.cargoName;
	}

	public void setCargoName(String cargoName) {
		this.cargoName = cargoName;
	}

	public Date getRepertoryTime() {
		return this.repertoryTime;
	}

	public void setRepertoryTime(Date repertoryTime) {
		this.repertoryTime = repertoryTime;
	}

	public String getRepertoryState() {
		return this.repertoryState;
	}

	public void setRepertoryState(String repertoryState) {
		this.repertoryState = repertoryState;
	}

	public Double getRepertoryVolume() {
		return this.repertoryVolume;
	}

	public void setRepertoryVolume(Double repertoryVolume) {
		this.repertoryVolume = repertoryVolume;
	}

	public String getFromStand() {
		return this.fromStand;
	}

	public void setFromStand(String fromStand) {
		this.fromStand = fromStand;
	}

	public String getToStand() {
		return this.toStand;
	}

	public void setToStand(String toStand) {
		this.toStand = toStand;
	}

	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getConsigner() {
		return this.consigner;
	}

	public void setConsigner(String consigner) {
		this.consigner = consigner;
	}

	public String getConsignee() {
		return this.consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}