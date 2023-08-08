/**
 *  Program to display first n Odd Numbers
 * @author Satya Sai Praveen
 *  @since 30th July 2023
 */

package com.Techzenure.Day_3;

import java.util.Scanner;

public class DisplayOddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many ODD Numbers to be Displayed:");
		int n=sc.nextInt();
		sc.close();
		
		System.out.println("First " +n+ "Odd Numbers are: ");
		int num=1;
		int count=1;
		while(count<=n) {
			System.out.print(num+"   ");
			num +=2;
			count++;
		}//end of while
	}
}
