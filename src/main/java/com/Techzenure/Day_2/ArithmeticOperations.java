/**
 *  Write program to perform all the arithmetic operations given below.
    -> Addition 
    -> Subtraction
    -> Multiplication
    -> Division
    -> Increment operator
    -> Decrement operator
 * @author Satya Sai Praveen
 *  @since 28th July 2023
 */

package com.Techzenure.Day_2;

public class ArithmeticOperations {

	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		
		// Addition Operation
		int add=a+b;
		System.out.println("Addition   :   " +add );
		
		// Subtraction Operation
		int sub=a-b;
		System.out.println("Subtraction :    " +sub);
		
		// Multiplication Operation
		int mul=a*b;
		System.out.println("Multiplication  :   " +mul);
		
		// Division Operation
		float div=a/b;
		System.out.println("Division   :  " +div);
		
		// Increment Operator
		int incre=12;
		incre++;
		System.out.println("Increment Value  :  " + incre);
		
		// Decrement Operator
		int decre=12;
		decre--;
		System.out.println("Decrement Value  :  " +decre);
	}

}
