/**
 *  Program to create an account type Current Account with Parent Class "Account"
 * @author Satya Sai Praveen
 *  @since 6th August 2023
 */
package com.Techzenure.Day_5;

public class CurrentAccount extends Account {

	int freeTrans = 3;
	int transactionCount = 0;
	int transRate = 100;
	
	public CurrentAccount(long acno, String name, float bal) {
		super(acno, name, bal);	
	}

	@Override
	public void deposit(float amt) {
		transactionCount++;
		super.deposit(amt);
	}

	@Override
	public void withdraw(float amt) {
		transactionCount++;
		super.withdraw(amt);
	}

	@Override
	public void getBalance() {
		transactionCount++;
		super.getBalance();
	}

	public void serviceCharge() {
		int serviceChargeCounts = transactionCount - freeTrans;
		if(serviceChargeCounts > 0) {
			transactionCount =0;
			float amt=serviceChargeCounts * transRate;
			super.withdraw(amt);
		}else {
			System.out.println("No Service Charge, only" +transactionCount+ " / " +freeTrans);
		}
	}
}
