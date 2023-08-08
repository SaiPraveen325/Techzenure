/**
 *  Program to display the reverse of a given number
 * @author Satya Sai Praveen
 *  @since 30th July 2023
 */
package com.Techzenure.Day_3;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		sc.close();
		
		int reversedNumber=reverseNumber(num);
		System.out.println("Reversed Number is :" +reversedNumber);

	}
//using the String Buffer
	private static int reverseNumber(int num) {
		String numString=Integer.toString(num);
		StringBuffer sb=new StringBuffer(numString);
		sb.reverse();
		int reversed=Integer.parseInt(sb.toString());
		return reversed;
	}

}
