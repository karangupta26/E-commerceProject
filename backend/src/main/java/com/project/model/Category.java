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
	@OneToMany(mappedBy="category",cascade=CascadeType.ALL)
	private List<Product> product;
	
	public int getCatId() {
		return catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public String getIdealfor() {
		return idealfor;
	}

	public void setIdealfor(String idealfor) {
		this.idealfor = idealfor;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString(){
		return this.catId+" "+this.idealfor;
	}
	
}
