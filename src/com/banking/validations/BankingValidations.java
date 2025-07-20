package com.banking.validations;

import com.banking.core.AccountType;
import com.banking.custom_exceptions.BankingException;

public class BankingValidations {
	

//add a static method to validation balance
	public static void validateBalance(AccountType type,   int balance) throws BankingException {
		if (balance < type.getMinBalance())
			throw new BankingException("Insufficient Balance !!!!!");
	}

	// add a static method to validate account type
	public static AccountType validateAccountType(String acctType) throws IllegalArgumentException {
		return AccountType.valueOf(acctType.toUpperCase());
	}

}
