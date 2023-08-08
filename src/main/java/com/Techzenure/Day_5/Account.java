/**
 *  Program to create an account with account number, name, balance
 * @author Satya Sai Praveen
 *  @since 6th August 2023
 */
package com.Techzenure.Day_5;

public class Account {
	private long acno;
	private String name;
	private float bal;
	
	public Account(long acno, String name, float bal) {
	this.acno=acno;
	this.name=name;
	this.bal=bal;
	}
	
	public float getBal() {
		return bal;
	}

	//Creation of Deposit of Money
	public void deposit(float amt) {
		this.bal +=amt;
		System.out.println("Rs:" +amt+ "  Credited: |  Balance:   "+this.bal);
	}
	
	// Creation of Withdraw of Money method
	public void withdraw(float amt) {
		if(this.bal >= amt) {
			this.bal = this.bal -amt;
			System.out.println("Rs:" +amt+ "  Debited: |  Balance:   "+this.bal);
		}else {
			System.err.println("***Error*** Insufficient Fund");
		}		
	}

	// Creation of Get Balance method
		public void getBalance() {
		System.out.println("A/C No:" +this.acno+ "|  Name:" +this.name +"|  Balance:" +this.bal );
	}
}
