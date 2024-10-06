package bank;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * A bank account class that creates UserBankAccount objects and can
 * be specified as checking or savings, and can be labelled.
 */
public class UserBankAccount extends Bank {
	private double balance;
	private String accountHolderFirstName;
	private String accountHolderLastName;
	private String accountType;

	Scanner keyboard = new Scanner(System.in);

	public UserBankAccount() {
		balance = 0.0;
		accountHolderFirstName = "";
		accountHolderLastName = "";
		accountType = "";
	}

	public UserBankAccount(String type, double bal, String fn, String ln) {
		accountType = type;
		balance = bal;
		accountHolderFirstName = fn;
		accountHolderLastName = ln;
	}

	/**
	 * A getter function that returns the balance of a bank account
	 * 
	 * @return bank account balance
	 */
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setName(String accountHolderFirstName, String accountHolderLastName) {
		this.accountHolderFirstName = accountHolderFirstName;
		this.accountHolderLastName = accountHolderLastName;
	}

	public void depositMoney(double amount) {
		// System.out.print("Please enter the amount you want to deposit: ");
		// double amount = keyboard.nextDouble();
		balance += amount;
		// System.out.println("Your new balance is " + getBalance());
		// keyboard.close();
	}

	public void withdrawMoney(double amount) {
		// System.out.print("Please enter the amount you want to withdraw: ");
		// double amount = keyboard.nextDouble();
		balance -= amount;
		// System.out.println("Your new balance is " + getBalance());
		// keyboard.close();
	}

	public void displayAccounts() {
		for (UserBankAccount i : accountsOpen) {
			System.out.print("[" + i.getLabel() + ",");
			System.out.print("]");
		}
	}

	public void selectOption() {
		int input = 0;

		while (input != 6) {
			System.out.println("What would you like to do? ");
			System.out.print("1. View balance on account \n");
			System.out.print("2. Deposit money \n");
			System.out.print("3. Withdraw money \n");
			System.out.print("4. Transfer money \n");
			System.out.print("5. Create new savings bucket \n");
			System.out.println("6. Exit \n");

			input = keyboard.nextInt();

			switch (input) {
				case 1:
					System.out.println("Please select an account: ");
					displayAccounts();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					System.out.print("Have a good day!");
					break;
			}
		}

	}

	public void welcomeMessage() {
		System.out.println("Welcome " + accountHolderFirstName + "!");
		// selectOption();
	}

}
