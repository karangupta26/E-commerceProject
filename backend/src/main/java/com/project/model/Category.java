package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

 
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String idealfor;
	private String sleeve;
	private String type;
	private String necktype;
	private int pockets;
	@OneToOne
	@JoinColumn(name="pid")
	private Product product;
	
	public int getPockets() {
		return pockets;
	}
	public void setPockets(int pockets) {
		this.pockets = pockets;
	}
	public String getNecktype() {
		return necktype;
	}
	public void setNecktype(String necktype) {
		this.necktype = necktype;
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
	public Product getProduct(Product product){
		return product;
	}

}
