package com.Techzenure.Day_6;

import java.util.Scanner;

public class MainClass {
		public static Hosteller getHostellerDetails() {
			Scanner sc=new Scanner(System.in);
			Hosteller hstr=new Hosteller();
			
			System.out.println("Enter Student ID: ");
			hstr.setStudentId(sc.nextInt());
			
			System.out.println("Enter Name: ");
			hstr.setName(sc.nextLine());
			sc.nextLine();
			
			System.out.println("Enter Department ID: ");
			 hstr.setDepartmentId(sc.nextInt());
			 
			 System.out.println("Enter the Gender: ");
			 hstr.setGender(sc.nextLine());
             sc.nextLine();
			 
			 System.out.println("Enter the Phone Number: ");
			 hstr.setPhone(sc.nextLine());
			 
			 System.out.println("Enter Hostel Name: ");
			 hstr.setHostelName(sc.nextLine());
			 
			 System.out.println("Enter the Room Number: ");
			 hstr.setRoomNumber(sc.nextInt());
			 
			sc.close();
			return hstr;			
		}

public static void main(String[] args) {
	Hosteller hstr=getHostellerDetails();
	
	//Displaying the Entered Details
	System.out.println("\n Hosteller Details:");
	System.out.println("Student Id :" + hstr.getStudentId());
	System.out.println("Name :" +hstr.getName());
	System.out.println("Department ID :" +hstr.getDepartmentId());
	System.out.println("Gender :"+hstr.getGender());
	System.out.println("Phone Number :" +hstr.getPhone());
	System.out.println("Hostel Name :" +hstr.getHostelName());
	System.out.println("Room Number :" +hstr.getRoomNumber());
	
	//Updating the Room number and Phone Number
	Scanner sc=new Scanner(System.in);
	System.out.print("\nEnter new Room Number:");
	hstr.setRoomNumber(sc.nextInt());
	
	System.out.println("Enter the new Phone Number:");
	sc.nextLine();
	hstr.setPhone(sc.nextLine());

	
	//displaying the updated Details
	System.out.println("\n Updated Hosteller Details:");
	System.out.println("Student Id :" + hstr.getStudentId());
	System.out.println("Name :" +hstr.getName());
	System.out.println("Department ID :" +hstr.getDepartmentId());
	System.out.println("Gender :"+hstr.getGender());
	System.out.println("Phone Number :" +hstr.getPhone());
	System.out.println("Hostel Name :" +hstr.getHostelName());
	System.out.println("Room Number :" +hstr.getRoomNumber());
	
	sc.close();
	}
}

