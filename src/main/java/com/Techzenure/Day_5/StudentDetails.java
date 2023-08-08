/**
 *  Program to generate the Student Details 
 * @author Satya Sai Praveen
 *  @since 7th August 2023
 */
package com.Techzenure.Day_5;

import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter StudentId:");
		int studentId=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Student Name:");
		String studentName=sc.nextLine();
		
		System.out.println("Enter Student Address: ");
		String studentAddress=sc.nextLine();
		
		System.out.println("Student Belongs to NIT? (Yes/No): ");
		String isFromNIT=sc.nextLine();
		
		Student stud;
		while(!isFromNIT.equals("Yes") && !isFromNIT.equals("No")) {
			System.out.println("Wrong Input... Please enter 'Yes' or 'No': ");
			isFromNIT=sc.nextLine();
		}
		if(isFromNIT.equals("Yes")) {
			stud=new Student(studentId, studentName, studentAddress);
			
		}else {
			System.out.println("Enter College Name:");
			String collegeName=sc.nextLine();
			stud=new Student(studentId, studentName, studentAddress, collegeName);
			
		}
		sc.close();
		
		System.out.println("Student Id:" +stud.getStudentId());
		System.out.println("Student Name:" +stud.getStudentName());
		System.out.println("Student Address:" +stud.getStudentAddress());
		System.out.println("College Name:" +stud.getCollegeName());
	}
}
