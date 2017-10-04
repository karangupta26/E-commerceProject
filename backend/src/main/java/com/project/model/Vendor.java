package com.project.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;

import org.hibernate.annotations.Cascade;

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
