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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String idealfor;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
	private List<Product> product;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString(){
		return this.idealfor+" "+this.id;
	}

}
