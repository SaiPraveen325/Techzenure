/**
 *  Program to generate the Movie Ticket with the discount option
 * @author Satya Sai Praveen
 *  @since 30th July 2023
 */
package com.Techzenure.Day_3;

import java.util.Scanner;

public class TicketCalculation {

	public static void main(String[] args) {
		float kingClassTicket=75.0f;
		float queenClassTicket=150.0f;
		float refreshmentCost=50.0f;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the No of tickets to Book:");
		int noOfTickets=sc.nextInt();
		
		System.out.println("Do you need Refreshment...");
		char ref=sc.next().charAt(0);
		
		System.out.println("Enter the ticket type---K for King Class , Q for Queen Class ");
		char ticketType=sc.next().charAt(0);

		sc.close();
		
		float totalCost=0.0f;
		if(noOfTickets<5 || noOfTickets>40) {
			System.out.println("Minimum of  5 Tickets or Less Than 40 Tickets should be Selected");
		}else if(ticketType=='K' || ticketType == 'k') {
			totalCost=kingClassTicket * noOfTickets;
		}else if(ticketType=='Q' || ticketType == 'q') {
			totalCost=queenClassTicket * noOfTickets;
		}else {
			System.out.println("Invalid Input: ");
			return;
		}
		//10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets
		if(noOfTickets >20) {
			totalCost *=0.9;
		}
		
		if(ref == 'Y' || ref=='y') {
			totalCost +=refreshmentCost * noOfTickets;
		}
		System.out.printf("Total Cost= %.2f", totalCost);
	}
}
