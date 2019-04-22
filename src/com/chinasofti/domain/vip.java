package com.chinasofti.domain;

public class vip {
	private int vid;
	private String vname;
	private String vsex;
	private double money;
	private String vlevel;
	public vip(int vid, String vname, String vsex, double money, String vlevel) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vsex = vsex;
		this.money = money;
		this.vlevel = vlevel;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getVsex() {
		return vsex;
	}
	public void setVsex(String vsex) {
		this.vsex = vsex;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getVlevel() {
		return vlevel;
	}
	public void setVlevel(String vlevel) {
		this.vlevel = vlevel;
	}
	@Override
	public String toString() {
		return this.getVid()+"\t\t"+this.getVname()+"\t\t"+this.getVsex()+"\t\t"+this.getMoney()+"\t\t"+this.getVlevel();
	}
	
}
