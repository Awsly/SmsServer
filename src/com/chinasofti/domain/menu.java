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
	
	public int getmmid() {
		return mmid;
	}
	public void setmmid(int mmid) {
		this.mmid = mmid;
	}
	public String getmmname() {
		return mmname;
	}
	public void setmmname(String mmname) {
		this.mmname = mmname;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price = price;
	}
	public int getkid() {
		return kid;
	}
	public void setkid(int kid) {
		this.kid = kid;
	}
	
	@Override
	public String toString() {
		
		return this.getmmid()+"\t\t"+this.getmmname()+"\t\t"+this.getprice()+"\t\t"+this.getkid();
	}
}
