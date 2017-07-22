package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int pid;
	private String modelDetails;
	private String pattern;
	private String styleType;
	private String weartype;
	private String styleCode;
	private String color;
	private String fabriccare;
	private double price;
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
}