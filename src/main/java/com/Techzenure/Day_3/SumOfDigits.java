/**
 *  Program to display the sum of the given number
 * @author Satya Sai Praveen
 *  @since 30th July 2023
 */
package com.Techzenure.Day_3;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		sc.close();
		
		int sum=0;
		int num1=num;
		while(num1 !=0) {
			int givenNum=num1%10;
			sum +=givenNum;
			num1 /=10;
		}
		System.out.println("Sum of given number  " +num+ "   is :" +sum);
	}
}
