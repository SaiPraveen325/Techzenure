/**
 *  Program to create an account type Savings Account with Parent Class "Account"
 * @author Satya Sai Praveen
 *  @since 6th August 2023
 */
package com.Techzenure.Day_5;

public class SavingsAccount extends Account {
	public SavingsAccount(long acno, String name, float bal) {
		super(acno, name, bal);
			}

	float roi;
	
		public void calculateInterest() {
		float intrest=roi * this.getBal() / 100;
		super.deposit(intrest);
	}
}
