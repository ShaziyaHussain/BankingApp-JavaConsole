package com.banking.operations;

import com.banking.core.BankAccount;
import com.banking.custom_exceptions.BankingException;

public interface BankOperations {
//add a method for creating bank account
	String createAccount(int acctNo, String customerName, int openingBalnce, String openingDate, String acctType)
			throws BankingException;

	// display all acounts
	void displayAllAccounts();

	// add a method to get a/c summary
	BankAccount getAccountSummary(int acctNo) throws BankingException;

	// add a method to deposit funds
	String depositFunds(int acctNo, int amount) throws BankingException;

	// add a method to withdraw funds
	String withdrawFunds(int acctNo, int amount) throws BankingException;

	// add a method to transfer funds
	String transferFunds(int srcAcctNo, int destAcctNo, int amount) throws BankingException;

	// add a method to close the a/c
	String closeAccount(int acctNo) throws BankingException;

	// add a method to sort acct by acct no : asc
	void sortAccountsByAcctNo();

	// add a method to sort acct by date n balance
	void sortAccountsByDateAndBalance();

}
