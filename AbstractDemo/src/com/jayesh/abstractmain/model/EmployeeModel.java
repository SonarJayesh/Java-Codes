package com.jayesh.abstractmain.model;

public class EmployeeModel {
	private int eId;
	private String eName;
	private double eSalary;

	public void seteId(int eId) {
		this.eId = eId;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	
	
	
	public int geteId() {
		return eId;
	}
	public String geteName() {
		return eName;
	}
	public double geteSalary() {
		return eSalary;
	}
}
