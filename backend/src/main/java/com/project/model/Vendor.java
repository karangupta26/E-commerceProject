package com.project.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;

@Entity
public class Vendor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vendorId;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="UserId")
	@Valid
	private User vuser;
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public User getVuser() {
		return vuser;
	}
	public void setVuser(User vuser) {
		this.vuser = vuser;
	}	
	

}
