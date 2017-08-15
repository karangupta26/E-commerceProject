package com.project.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	private int qty;
	private String productname;
	private String modelDetails;
	private String brand;
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
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="vendorId")
	private Vendor vendor;
	@ManyToOne
	@JoinColumn(name="CatId")
	private Category category;
	@Transient
	private MultipartFile image;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getModelDetails() {
		return modelDetails;
	}
	public void setModelDetails(String modelDetails) {
		this.modelDetails = modelDetails;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getStyleType() {
		return styleType;
	}
	public void setStyleType(String styleType) {
		this.styleType = styleType;
	}
	public String getWeartype() {
		return weartype;
	}
	public void setWeartype(String weartype) {
		this.weartype = weartype;
	}
	public String getStyleCode() {
		return styleCode;
	}
	public void setStyleCode(String styleCode) {
		this.styleCode = styleCode;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFabriccare() {
		return fabriccare;
	}
	public void setFabriccare(String fabriccare) {
		this.fabriccare = fabriccare;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSleeve() {
		return sleeve;
	}
	public void setSleeve(String sleeve) {
		this.sleeve = sleeve;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
}
