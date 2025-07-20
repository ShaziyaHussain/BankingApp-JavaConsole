package com.banking.core;
/*
 * acct no (Unique value – UID | Primary Key), customer name , balance 
 * , opening date : LocalDate , acct type : enum
 */

import java.time.LocalDate;

public class BankAccount implements Comparable<BankAccount>{
	private int acctNo;
	private String customerName;
	private int balance;
	private LocalDate openingDate;
	private AccountType acctType;

	public BankAccount(int acctNo, String customerName, int balance, LocalDate openingDate, AccountType acctType) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.balance = balance;
		this.openingDate = openingDate;
		this.acctType = acctType;
	}
	//add overloaded constructor to init acct no
	public BankAccount(int acctNo) {
		super();
		this.acctNo = acctNo;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", balance=" + balance
				+ ", openingDate=" + openingDate + ", acctType=" + acctType + "]";
	}

	


	/*
	 * override equals method - to replace reference equality by UID equality - acct
	 * no
	 */
	@Override
	public boolean equals(Object anotherObject) {
		System.out.println("in acct's equals");
		if (anotherObject instanceof BankAccount) {
			return this.acctNo == ((BankAccount) anotherObject).acctNo;
		}
		return false;
	}
	
	@Override
	public int compareTo(BankAccount anotherAcc)
	{
		System.out.println("in bank acct - compareTo");
		if(this.acctNo < anotherAcc.acctNo)
			return -1;
		if(this.acctNo == anotherAcc.acctNo)
			return 0;
		return 1;
		
	}
	
	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAcctNo() {
		return acctNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public LocalDate getOpeningDate() {
		return openingDate;
	}
	public AccountType getAcctType() {
		return acctType;
	}
	
	
	

}
