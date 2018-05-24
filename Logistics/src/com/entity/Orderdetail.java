package com.entity;

/**
 * Orderdetail entity. @author MyEclipse Persistence Tools
 */

public class Orderdetail implements java.io.Serializable {

	// Fields

	private Integer cargoId;
	private Order order;
	private String cargoName;
	private String cargoNumber;
	private String cargoWeight;
	private String cargoVolume;
	private String cargoPack;
	private String cargoSpecification;
	private String cargoModel;
	private Integer shouhuo;

	// Constructors

	/** default constructor */
	public Orderdetail() {
	}

	/** minimal constructor */
	public Orderdetail(String cargoPack, String cargoSpecification, String cargoModel) {
		this.cargoPack = cargoPack;
		this.cargoSpecification = cargoSpecification;
		this.cargoModel = cargoModel;
	}

	/** full constructor */
	public Orderdetail(Order order, String cargoName, String cargoNumber, String cargoWeight, String cargoVolume,
			String cargoPack, String cargoSpecification, String cargoModel, Integer shouhuo) {
		this.order = order;
		this.cargoName = cargoName;
		this.cargoNumber = cargoNumber;
		this.cargoWeight = cargoWeight;
		this.cargoVolume = cargoVolume;
		this.cargoPack = cargoPack;
		this.cargoSpecification = cargoSpecification;
		this.cargoModel = cargoModel;
		this.shouhuo = shouhuo;
	}

	// Property accessors

	public Integer getCargoId() {
		return this.cargoId;
	}

	public void setCargoId(Integer cargoId) {
		this.cargoId = cargoId;
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

	public String getCargoNumber() {
		return this.cargoNumber;
	}

	public void setCargoNumber(String cargoNumber) {
		this.cargoNumber = cargoNumber;
	}

	public String getCargoWeight() {
		return this.cargoWeight;
	}

	public void setCargoWeight(String cargoWeight) {
		this.cargoWeight = cargoWeight;
	}

	public String getCargoVolume() {
		return this.cargoVolume;
	}

	public void setCargoVolume(String cargoVolume) {
		this.cargoVolume = cargoVolume;
	}

	public String getCargoPack() {
		return this.cargoPack;
	}

	public void setCargoPack(String cargoPack) {
		this.cargoPack = cargoPack;
	}

	public String getCargoSpecification() {
		return this.cargoSpecification;
	}

	public void setCargoSpecification(String cargoSpecification) {
		this.cargoSpecification = cargoSpecification;
	}

	public String getCargoModel() {
		return this.cargoModel;
	}

	public void setCargoModel(String cargoModel) {
		this.cargoModel = cargoModel;
	}

	public Integer getShouhuo() {
		return this.shouhuo;
	}

	public void setShouhuo(Integer shouhuo) {
		this.shouhuo = shouhuo;
	}

}