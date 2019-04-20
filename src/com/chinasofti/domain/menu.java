package com.chinasofti.domain;

public class menu {
	private  int mmid;
	private String mmname;
	private double price;
	private int kid;
	public menu(int mmid, String mmname, double price, int kid) {
		super();
		this.mmid = mmid;
		this.mmname = mmname;
		this.price = price;
		this.kid = kid;
	}
	
	public int getMmid() {
		return mmid;
	}
	public void setMmid(int mmid) {
		this.mmid = mmid;
	}
	public String getMmname() {
		return mmname;
	}
	public void setMmname(String mmname) {
		this.mmname = mmname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	
	@Override
	public String toString() {
		
		return this.getMmid()+"\t\t"+this.getMmname()+"\t\t"+this.getPrice()+"\t\t"+this.getKid();
	}
}
