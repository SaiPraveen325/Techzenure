/**
 * Program to Generate Bill in Theater
 * @author Satya Sai Praveen
 *  @since 28th July 2023
 ________________________________________
 * Bill Generation
     Tom went to a movie with his friends in a multiplex theater and during break time he bought pizzas, puffs and cool drinks. 
     Consider   the following prices: 
			Rs.100/pizza
			Rs.20/puffs
			Rs.10/cool drink
	Generate a bill for What Tom has bought.
    Sample Input 1:
    enter the no of pizzas bought: 10
    enter the no of puffs bought: 12
    enter the no of cool drinks bought: 5
    Sample Output 1:
   Bill Details
   No of Pizzas: 10         Cost: 1000
   No of Puffs:12           Cost:  240
   No of Cool Drinks:5      Cost:   50
   Total price=1290.00
   ENJOY THE SHOW!!!
 */
 
package com.Techzenure.Day_2;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		int pizzaPrice = 100;
		int puffPrice=20;
		int coolDrinkPrice=10;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number Of Pizzas:");
		int pizzaQty=sc.nextInt();
		System.out.println("Enter the Number Of Puffs:");
		int puffQty=sc.nextInt();
		System.out.println("Enter the Number Of CoolDrinks:");
		int coolDrinkQty=sc.nextInt();
		System.out.println();
		
		float pizzaCost=pizzaPrice * pizzaQty;
		float puffCost=puffPrice * puffQty;
		float coolDrinkCost=coolDrinkPrice * coolDrinkQty;
		
		float totalCost=pizzaCost+puffCost+coolDrinkCost;
		
		System.out.println("***Bill Details***");
		System.out.printf("No of Pizzas          : %d \t Cost: %.2f \n",pizzaQty , pizzaCost);
		System.out.printf("No of Puffs			    : %d \t Cost: %.2f \n",puffQty , puffCost);
		System.out.printf("No of CoolDrinks	: %d \t Cost: %.2f \n",coolDrinkQty , coolDrinkCost);
		System.out.println();
		
		System.out.printf("Total Price: %.2f \n",totalCost);
		System.out.println();
		System.out.println("Enjoy the Show!!!");
		sc.close();
				}
}


