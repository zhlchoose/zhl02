package com.entity;

import java.util.Date;

/**
 * Waybill entity. @author MyEclipse Persistence Tools
 */

public class Waybill implements java.io.Serializable {

	// Fields

	private Integer id;
	private Branch branch;
	private Emp emp;
	private Payment payment;
	private Order order;
	private Waybilltype waybilltype;
	private Pickingway pickingway;
	private Date waybillTime;
	private String deliveryRelease;
	private Integer receiptNum;
	private String wayBillRemarks;
	private Double volumeUnitPrice;
	private Double weightUnitPrice;
	private Double loans;
	private Double totalFreight;
	private String deTuned;
	private String duetothe;
	private Integer serverId;

	// Constructors

	/** default constructor */
	public Waybill() {
	}

	/** full constructor */
	public Waybill(Branch branch, Emp emp, Payment payment, Order order, Waybilltype waybilltype, Pickingway pickingway,
			Date waybillTime, String deliveryRelease, Integer receiptNum, String wayBillRemarks, Double volumeUnitPrice,
			Double weightUnitPrice, Double loans, Double totalFreight, String deTuned, String duetothe,
			Integer serverId) {
		this.branch = branch;
		this.emp = emp;
		this.payment = payment;
		this.order = order;
		this.waybilltype = waybilltype;
		this.pickingway = pickingway;
		this.waybillTime = waybillTime;
		this.deliveryRelease = deliveryRelease;
		this.receiptNum = receiptNum;
		this.wayBillRemarks = wayBillRemarks;
		this.volumeUnitPrice = volumeUnitPrice;
		this.weightUnitPrice = weightUnitPrice;
		this.loans = loans;
		this.totalFreight = totalFreight;
		this.deTuned = deTuned;
		this.duetothe = duetothe;
		this.serverId = serverId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Payment getPayment() {
		return this.payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Waybilltype getWaybilltype() {
		return this.waybilltype;
	}

	public void setWaybilltype(Waybilltype waybilltype) {
		this.waybilltype = waybilltype;
	}

	public Pickingway getPickingway() {
		return this.pickingway;
	}

	public void setPickingway(Pickingway pickingway) {
		this.pickingway = pickingway;
	}

	public Date getWaybillTime() {
		return this.waybillTime;
	}

	public void setWaybillTime(Date waybillTime) {
		this.waybillTime = waybillTime;
	}

	public String getDeliveryRelease() {
		return this.deliveryRelease;
	}

	public void setDeliveryRelease(String deliveryRelease) {
		this.deliveryRelease = deliveryRelease;
	}

	public Integer getReceiptNum() {
		return this.receiptNum;
	}

	public void setReceiptNum(Integer receiptNum) {
		this.receiptNum = receiptNum;
	}

	public String getWayBillRemarks() {
		return this.wayBillRemarks;
	}

	public void setWayBillRemarks(String wayBillRemarks) {
		this.wayBillRemarks = wayBillRemarks;
	}

	public Double getVolumeUnitPrice() {
		return this.volumeUnitPrice;
	}

	public void setVolumeUnitPrice(Double volumeUnitPrice) {
		this.volumeUnitPrice = volumeUnitPrice;
	}

	public Double getWeightUnitPrice() {
		return this.weightUnitPrice;
	}

	public void setWeightUnitPrice(Double weightUnitPrice) {
		this.weightUnitPrice = weightUnitPrice;
	}

	public Double getLoans() {
		return this.loans;
	}

	public void setLoans(Double loans) {
		this.loans = loans;
	}

	public Double getTotalFreight() {
		return this.totalFreight;
	}

	public void setTotalFreight(Double totalFreight) {
		this.totalFreight = totalFreight;
	}

	public String getDeTuned() {
		return this.deTuned;
	}

	public void setDeTuned(String deTuned) {
		this.deTuned = deTuned;
	}

	public String getDuetothe() {
		return this.duetothe;
	}

	public void setDuetothe(String duetothe) {
		this.duetothe = duetothe;
	}

	public Integer getServerId() {
		return this.serverId;
	}

	public void setServerId(Integer serverId) {
		this.serverId = serverId;
	}

}