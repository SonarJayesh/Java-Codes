package com.jayesh.abstractmain;
import java.util.Scanner;
import com.jayesh.abstractmain.model.EmployeeModel;

public class EmployeeMain {

	EmployeeModel employeeModel = new EmployeeModel();
	
	public void setEmployee() {
		
		Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Employee id:");
			employeeModel.seteId(scanner.nextInt());
			
			System.out.println("Enter the Employee Name :");
			employeeModel.seteName(scanner.next());
			
			System.out.println("Enter the Employee Salary:");
			employeeModel.seteSalary(scanner.nextDouble());
		}
	 
	
	public void getEmployee() {
		
		System.out.println("Employye Id: "+employeeModel.geteId());
		System.out.println("Employye Name: "+employeeModel.geteName());
		System.out.println("Employye Salary: "+employeeModel.geteSalary());
		
	}
	
	public static void main(String[] args) {
		EmployeeMain employeemain = new EmployeeMain();
		employeemain.setEmployee();
		employeemain.getEmployee();
		
	}
}
