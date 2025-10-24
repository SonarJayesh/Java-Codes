package com.jayesh.abstractstud;

import java.util.Scanner;

import com.jayesh.abstractstud.model.StudentInfoModel;

public class StudentInfoMain {
	
	StudentInfoModel studentInfoModel = new StudentInfoModel();
	public void setStudent() {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Enter the Student RollNo : ");
		studentInfoModel.setrolNo(scanner.nextInt());
		
		System.out.println("Enter the Student Name :");
		studentInfoModel.setsName(scanner.next());
		
		System.out.println("Enter the Student Fees :");
		studentInfoModel.setsFees(scanner.nextDouble());
		
		System.out.println("Enter the Student Mobile No :");
		studentInfoModel.setmobNo(scanner.next());
		
	}

	public void getStudent() {
		
		System.out.println("Student RollNo : "+ studentInfoModel.getrolNo());
		System.out.println("Student Name : "+ studentInfoModel.getsName());
		System.out.println("Student Fees : "+ studentInfoModel.getsFees());
		System.out.println("Student MobileNo : "+ studentInfoModel.getmobNo());
		
	}
	public static void main(String[] args) {
		StudentInfoMain studentInfoMain = new StudentInfoMain();
		studentInfoMain.setStudent();
		studentInfoMain.getStudent();

	}

}
