package bank;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * A bank account class that creates UserBankAccount objects and can
 * be specified as checking or savings, and can be labelled.
 */
public class UserBankAccount {
	private static double balance;
	static String accountHolderFirstName;
	static String accountHolderLastName;
	static String accountType;
	static String accountLabel;
	ArrayList<UserBankAccount> accountsOpen = new ArrayList<UserBankAccount>();

	Scanner keyboard = new Scanner(System.in);

	public UserBankAccount() {
		balance = 0.0;
		accountHolderFirstName = "";
		accountHolderLastName = "";
		accountType = "";
		accountLabel = "";
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

	public void setBalance(double bal) {
		balance = bal;
	}

	/**
	 * A getter function that returns the label of the bank account
	 * 
	 * @return bank account label
	 */
	public String getLabel() {
		return accountLabel;
	}

	public String getAccountType() {
		return accountType;
	}

	public void openAccount() {

	}

	public void depositMoney() {
		System.out.print("Please enter the amount you want to deposit: ");
		double amount = keyboard.nextDouble();
		balance += amount;
		System.out.println("Your new balance is " + getBalance());
		keyboard.close();
	}

	public void withdrawMoney() {
		System.out.print("Please enter the amount you want to withdraw: ");
		double amount = keyboard.nextDouble();
		balance -= amount;
		System.out.println("Your new balance is " + getBalance());
		keyboard.close();
	}

	public void transferMoney(UserBankAccount donor, UserBankAccount receiver, double amount) {
		donor.setBalance(donor.getBalance() - amount);
		receiver.setBalance(receiver.getBalance() + amount);

		System.out.println("Account " + donor.getLabel() + " now has a balance of " + donor.getBalance());
		System.out.println("Account " + receiver.getLabel() + " now has a balance of " + receiver.getBalance());
	}

	public void displayAccounts() {
		for (UserBankAccount i : accountsOpen) {
			System.out.print("[" + i.getAccountType() + ",");
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
