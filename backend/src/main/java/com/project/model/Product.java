package com.project.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
	@ManyToOne
	@JoinColumn(name="cid")
	private Category category;
	public int getPid() {
		return pid;
	}
	public int getQty() {
		return qty;
	}
	public String getProductname() {
		return productname;
	}
	public String getModelDetails() {
		return modelDetails;
	}
	public String getPattern() {
		return pattern;
	}
	public String getStyleType() {
		return styleType;
	}
	public String getWeartype() {
		return weartype;
	}
	public String getStyleCode() {
		return styleCode;
	}
	public String getColor() {
		return color;
	}
	public String getFabriccare() {
		return fabriccare;
	}
	public String getType() {
		return type;
	}
	public String getSleeve() {
		return sleeve;
	}
	public String getNecktype() {
		return necktype;
	}
	public int getPockets() {
		return pockets;
	}
	public double getPrice() {
		return price;
	}
	public Category getCategory() {
		return category;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public void setModelDetails(String modelDetails) {
		this.modelDetails = modelDetails;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public void setStyleType(String styleType) {
		this.styleType = styleType;
	}
	public void setWeartype(String weartype) {
		this.weartype = weartype;
	}
	public void setStyleCode(String styleCode) {
		this.styleCode = styleCode;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setFabriccare(String fabriccare) {
		this.fabriccare = fabriccare;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setSleeve(String sleeve) {
		this.sleeve = sleeve;
	}
	public void setNecktype(String necktype) {
		this.necktype = necktype;
	}
	public void setPockets(int pockets) {
		this.pockets = pockets;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
