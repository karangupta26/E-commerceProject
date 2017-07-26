package com.project.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;
 
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String idealfor;
	@OneToMany(targetEntity=Product.class)
	//@JoinColumn(name="pid")
	private List<Product> product;
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
	public void setProduct(List<Product> product){
		this.product=product;
	}
	public List<Product> getProduct(){
		return product;
	}

}
