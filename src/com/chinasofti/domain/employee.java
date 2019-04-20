package com.chinasofti.domain;

public class employee {
	private int eid;
	private String ename;
	private String esex;
	private int age;
	private String address;
	public employee(int eid, String ename, String esex, int age, String address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esex = esex;
		this.age = age;
		this.address = address;
	}
	public employee() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsex() {
		return esex;
	}
	public void setEsex(String esex) {
		this.esex = esex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return this.getEid()+"\t\t"+this.getEname()+"\t\t"+this.getEsex()+"\t\t"+this.getAge()+"\t\t"+this.getAddress();
	}
}
