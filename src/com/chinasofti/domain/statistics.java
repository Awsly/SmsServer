package com.chinasofti.domain;

public class statistics {
	private int mmid;
	private String mmname;
	private double price;
	public statistics(int mmid, String mmname, double price) {
		super();
		this.mmid = mmid;
		this.mmname = mmname;
		this.price = price;
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
	
	@Override
	public String toString() {
		return this.mmid+"\t\t"+this.mmname+"\t\t"+this.price;
	}
}
