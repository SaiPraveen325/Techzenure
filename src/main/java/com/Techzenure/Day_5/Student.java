/**
 *  Program to generate Student Information and sending to main class by getters method
 * @author Satya Sai Praveen
 *  @since 7th August 2023
 */
package com.Techzenure.Day_5;

	class Student{
		private int studentId;
		private String studentName;
		private String studentAddress;
		private String collegeName;
		
		//creation of Constructors: Students who are belonging to "NIT College"
		public Student(int studentId, String studentName, String studentAddress) {
			this.studentId=studentId;
			this.studentName=studentName;
			this.studentAddress=studentAddress;
			this.collegeName="NIT";
		}
		
		//creation of Constructors: Students who are from another college
		public Student(int studentId, String studentName, String studentAddress, String collegeName) {
			this.studentId=studentId;
			this.studentName=studentName;
			this.studentAddress=studentAddress;
			this.collegeName=collegeName;
		}
		
		// Getter Methods
		public int getStudentId() {
			return studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public String getStudentAddress() {
			return studentAddress;
		}

		public String getCollegeName() {
			return collegeName;
		}	
	}
