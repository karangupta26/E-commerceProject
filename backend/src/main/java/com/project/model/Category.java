package com.project.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
 
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int catId;
	private String idealfor;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Product> product;
	public int getCatId() {
		return catId;
	}
	public String getIdealfor() {
		return idealfor;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public void setIdealfor(String idealfor) {
		this.idealfor = idealfor;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	@Override
	public String toString(){
		return this.catId+" "+this.idealfor;
	}
	
}
