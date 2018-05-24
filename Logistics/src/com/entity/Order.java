package com.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private Branch branch;
	private Emp emp;
	private Orderstatus orderstatus;
	private Ordertype ordertype;
	private Pickingway pickingway;
	private String orderUrgency;
	private Date orderDate;
	private Integer clienteleId;
	private Integer deliveryWay;
	private Integer receiptWay;
	private String orderCharge;
	private String orderRefuse;
	private String orderCancellation;
	private Integer orderCancellationName;
	private String orderRemarks;
	private Set waybills = new HashSet(0);
	private Set repertories = new HashSet(0);
	private Set orderdetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** full constructor */
	public Order(Branch branch, Emp emp, Orderstatus orderstatus, Ordertype ordertype, Pickingway pickingway,
			String orderUrgency, Date orderDate, Integer clienteleId, Integer deliveryWay, Integer receiptWay,
			String orderCharge, String orderRefuse, String orderCancellation, Integer orderCancellationName,
			String orderRemarks, Set waybills, Set repertories, Set orderdetails) {
		this.branch = branch;
		this.emp = emp;
		this.orderstatus = orderstatus;
		this.ordertype = ordertype;
		this.pickingway = pickingway;
		this.orderUrgency = orderUrgency;
		this.orderDate = orderDate;
		this.clienteleId = clienteleId;
		this.deliveryWay = deliveryWay;
		this.receiptWay = receiptWay;
		this.orderCharge = orderCharge;
		this.orderRefuse = orderRefuse;
		this.orderCancellation = orderCancellation;
		this.orderCancellationName = orderCancellationName;
		this.orderRemarks = orderRemarks;
		this.waybills = waybills;
		this.repertories = repertories;
		this.orderdetails = orderdetails;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
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

	public Orderstatus getOrderstatus() {
		return this.orderstatus;
	}

	public void setOrderstatus(Orderstatus orderstatus) {
		this.orderstatus = orderstatus;
	}

	public Ordertype getOrdertype() {
		return this.ordertype;
	}

	public void setOrdertype(Ordertype ordertype) {
		this.ordertype = ordertype;
	}

	public Pickingway getPickingway() {
		return this.pickingway;
	}

	public void setPickingway(Pickingway pickingway) {
		this.pickingway = pickingway;
	}

	public String getOrderUrgency() {
		return this.orderUrgency;
	}

	public void setOrderUrgency(String orderUrgency) {
		this.orderUrgency = orderUrgency;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getClienteleId() {
		return this.clienteleId;
	}

	public void setClienteleId(Integer clienteleId) {
		this.clienteleId = clienteleId;
	}

	public Integer getDeliveryWay() {
		return this.deliveryWay;
	}

	public void setDeliveryWay(Integer deliveryWay) {
		this.deliveryWay = deliveryWay;
	}

	public Integer getReceiptWay() {
		return this.receiptWay;
	}

	public void setReceiptWay(Integer receiptWay) {
		this.receiptWay = receiptWay;
	}

	public String getOrderCharge() {
		return this.orderCharge;
	}

	public void setOrderCharge(String orderCharge) {
		this.orderCharge = orderCharge;
	}

	public String getOrderRefuse() {
		return this.orderRefuse;
	}

	public void setOrderRefuse(String orderRefuse) {
		this.orderRefuse = orderRefuse;
	}

	public String getOrderCancellation() {
		return this.orderCancellation;
	}

	public void setOrderCancellation(String orderCancellation) {
		this.orderCancellation = orderCancellation;
	}

	public Integer getOrderCancellationName() {
		return this.orderCancellationName;
	}

	public void setOrderCancellationName(Integer orderCancellationName) {
		this.orderCancellationName = orderCancellationName;
	}

	public String getOrderRemarks() {
		return this.orderRemarks;
	}

	public void setOrderRemarks(String orderRemarks) {
		this.orderRemarks = orderRemarks;
	}

	public Set getWaybills() {
		return this.waybills;
	}

	public void setWaybills(Set waybills) {
		this.waybills = waybills;
	}

	public Set getRepertories() {
		return this.repertories;
	}

	public void setRepertories(Set repertories) {
		this.repertories = repertories;
	}

	public Set getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set orderdetails) {
		this.orderdetails = orderdetails;
	}

}