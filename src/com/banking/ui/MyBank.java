package com.banking.ui;

import java.util.Scanner;

import com.banking.operations.BankOperations;
import com.banking.operations.BankOperationsImpl;

public class MyBank {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			boolean exit = false;
			// create BankOperations implementation class instance
			BankOperations ops = new BankOperationsImpl();
			while (!exit) {
				try {
					System.out.println("Options - 1 : Create A/C \n " + "2. Display All accounts \n "
							+ "3.Get Account summary  \n " + "4.Deposit Funds  \n " + "5.Withdraw Funds  \n "
							+ "6.Transfer Funds  \n " + "7.Close account  \n "
							+ "8.Sort accounts as per a/c no  \n "
							+ "9.Sort accounts as per date n balance  \n "
							+ "0. Exit");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter  acctNo,  customerName, " + "openingBalance,  openingDate, acctType");

						// invoke create account method of bank operations implementation class

						System.out.println(
								ops.createAccount(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.next()));
						break;
					case 2:

						// display all accounts
						ops.displayAllAccounts();

						break;
					case 3: // display a/c summary
						System.out.println("Enter a/c no , to fetch a/c summary");
						System.out.println(ops.getAccountSummary(sc.nextInt()));
						break;
					case 4:
						System.out.println("Enter a/c no and deposit amount");
						System.out.println(ops.depositFunds(sc.nextInt(), sc.nextInt()));
						break;
					case 5:
						System.out.println("Enter a/c no and withdrawl amount");
						System.out.println(ops.withdrawFunds(sc.nextInt(), sc.nextInt()));
						break;
					case 6:
						System.out.println("Enter src a/c no , dest a/c no and  amount");
						System.out.println(ops.transferFunds(sc.nextInt(), sc.nextInt(), sc.nextInt()));
						break;

					case 7:
						System.out.println("Enter acct no to close the a/c");
						System.out.println(ops.closeAccount(sc.nextInt()));
						break;
					case 8 :
						ops.sortAccountsByAcctNo();
						break;
					case 9 :
						ops.sortAccountsByDateAndBalance();
						break;
					case 0:
						exit = true;
						break;

					}
				} catch (Exception e) {
					// read off entire line from the scanner
					sc.nextLine();
					// e.printStackTrace();
					System.out.println(e);
					System.out.println("Please retry !");
				}

			}

		} // JVM - sc.close()
		catch (Exception e) {
			System.out.println("err in main " + e);
		}

	}
}
