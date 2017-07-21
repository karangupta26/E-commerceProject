package com.project.model;

public class Category {
	
	private int cid;
	private String idealfor;
	private String sleeve;
	private String type;
	private String necktype;
	private int pockets;
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

}
