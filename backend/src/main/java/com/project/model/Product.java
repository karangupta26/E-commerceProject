package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private int qty;
	private String productname;
	private String modelDetails;
	private String pattern;
	private String styleType;
	private String weartype;
	private String styleCode;
	private String color;
	private String fabriccare;
	private String type;
	private String sleeve;
	private String necktype;
	private int pockets;
	private double price;
	@OneToOne
	@JoinColumn(name="cid")
	private Category category;
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getSleeve() {
		return sleeve;
	}
	public void setSleeve(String sleeve) {
		this.sleeve = sleeve;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getFabriccare() {
		return fabriccare;
	}
	public void setFabriccare(String fabriccare) {
		this.fabriccare = fabriccare;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getStyleCode() {
		return styleCode;
	}
	public void setStyleCode(String styleCode) {
		this.styleCode = styleCode;
	}
	public String getWeartype() {
		return weartype;
	}
	public void setWeartype(String weartype) {
		this.weartype = weartype;
	}
	public String getStyleType() {
		return styleType;
	}
	public void setStyleType(String styleType) {
		this.styleType = styleType;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getModelDetails() {
		return modelDetails;
	}
	public void setModelDetails(String modelDetails) {
		this.modelDetails = modelDetails;
	}
	public String getNecktype() {
		return necktype;
	}
	public void setNecktype(String necktype) {
		this.necktype = necktype;
	}
	public int getPockets() {
		return pockets;
	}
	public void setPockets(int pockets) {
		this.pockets = pockets;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
}
