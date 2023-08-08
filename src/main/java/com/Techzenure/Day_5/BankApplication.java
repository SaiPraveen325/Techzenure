/**
 *  Program to create an Banking Application with -Create Account with type Savings/Current
 *  																							  - Deposit
 *  																							- Withdraw
 *  																							- Balance
 *  																							- Interest Calculation
 *  																							- Service Charge
 *  																							- Exit				
 * @author Satya Sai Praveen
 *  @since 6th August 2023
 */
package com.Techzenure.Day_5;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account acc=null;
		
		while(true) {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Intrest Calculation");
			System.out.println("6. Service Charge");
			System.out.println("7. Exit");
			
			System.out.println("Enter the Option:");
			int opt=sc.nextInt();
			
			switch(opt) {
			case 1://Create Account
				if(acc==null) {
					System.out.println("Enter the type of Account [1.Savings account | 2.Current Account ]:");
					int accType=sc.nextInt();
					
					System.out.println("Enter Account Number:");
					long acNo=sc.nextLong();
					sc.nextLine();//when we given string datatype after the long datatype, the string data type is skipped to the next line
					
					System.out.println("Enter Name:");
					String name=sc.nextLine();
					
					System.out.println("Enter Initial Deposit:");
					float amt=sc.nextFloat();
					
					if(accType == 1) {
						System.out.println("Enter the rate of Interest: ");
						@SuppressWarnings("unused")
						float roi=sc.nextFloat();
						acc=new SavingsAccount(acNo, name,  amt);
					}else {
						acc= new CurrentAccount(acNo, name,amt);
					}
					//create an instance of the Account type
					acc=new Account(acNo,name,amt);
					System.out.println("Welcome to your Bank...");
					System.out.println("-----------------------------------");
				}else {
					System.out.println("You are having an account with us...Please do any other Options.");
				}
				break;
			case 2://Deposit
                if(acc!= null) {
					System.out.println("Enter the Amount to Deposit:");
					float amt=sc.nextFloat();
					acc.deposit(amt);
				}else {
					System.err.println("Please open an Account with Us!!!");
				}
				break;
			case 3://Withdraw
				if(acc!= null) {
					System.out.println("Enter the Amount to Withdraw:");
					float amt=sc.nextFloat();
					acc.withdraw(amt);
				}else {
					System.err.println("Please open an Account with Us!!!");
				}
				break;
			case 4://Get Details/Balance
				if(acc != null) {
					acc.getBal();
				}else {
					System.err.println("Please open an Account with Us!!!");
				}
				break;
			case 5: //Savings Account interest calculation
				if(acc instanceof SavingsAccount) {
					((SavingsAccount)acc).calculateInterest();
				}else {
					System.err.println("This Account number is not having this service:");
				}
				break;
			case 6://current account interest calculation
				if(acc instanceof CurrentAccount) {
					((CurrentAccount)acc).serviceCharge();
				}else {
					System.err.println("No service charges of this type of Account:");
				}
				break;
			case 7://exit
				System.out.println("Application was designed and developed by");
				System.out.println("\t team@Techzenure");
				sc.close();
				System.exit(0);//to terminate the program execution
				break;
			default:
					System.out.println("***Invalid Option----Try Again***");
			}//end of switch loop
			
		}//end of while loop
	}
}
