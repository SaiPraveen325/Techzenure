/**
 *  Program to display Even Number between X and Y
 * @author Satya Sai Praveen
 *  @since 30th July 2023
 */
package com.Techzenure.Day_3;

import java.util.Scanner;

public class DisplayEvenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of X :   ");
		int x=sc.nextInt();
		System.out.println("Enter the Value of Y :   ");
		int y= sc.nextInt();
		
		sc.close();
		
		if(x>=y) {
			System.out.println("Y should be greater than x:");
		}else {
			System.out.println("Even Numbers between " + x + " and " +y);
					if(x%2 !=0) {
					x++;
					}
				}
		
		for(int i=x; i<=y; i+=2) {
			System.out.print(i+"  ");
		}//end of for loop
	}

}
