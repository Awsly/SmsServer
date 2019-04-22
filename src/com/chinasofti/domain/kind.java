package com.chinasofti.domain;

public class kind {
	private int kid;
	private String kname;
	public kind(int kid, String kname) {
		super();
		this.kid = kid;
		this.kname = kname;
	}
	public int getkid() {
		return kid;
	}
	public void setkid(int kid) {
		this.kid = kid;
	}
	public String getkname() {
		return kname;
	}
	public void setkname(String kname) {
		this.kname = kname;
	}
	@Override
	public String toString() {
		return this.getkid()+"\t\t"+this.getkname();
	}
}
