package com.jayesh.abstractstud.model;

public class StudentInfoModel {

	private int rolNo;
	private String sName;
	private double sFees;
	private String mobNo;
	
	
	public void setrolNo(int rolNo) {
		this.rolNo = rolNo;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public void setsFees(double sFees) {
		this.sFees = sFees;
	}
	public void setmobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	
	
	public int getrolNo() {
		return this.rolNo;
	}
	public String getsName() {
		return this.sName;
	}
	public double getsFees() {
		return this.sFees;
	}
	public String getmobNo() {
		return this.mobNo;
	}
	
}
