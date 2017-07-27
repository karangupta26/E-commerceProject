package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.List;
 
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String idealfor;
	@OneToOne
	private Product product;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getIdealfor() {
		return idealfor;
	}
	public void setIdealfor(String idealfor) {
		this.idealfor = idealfor;
	}
	public void setProduct(Product product){
		this.product=product;
	}
	public Product getProduct(){
		return product;
	}

}
