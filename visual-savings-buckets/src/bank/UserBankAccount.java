package bank;

import java.util.Scanner;
import java.util.ArrayList;

public class UserBankAccount {
	static double balance;
	static String accountHolderFirstName;
	static String accountHolderLastName;
	static String accountType;
	ArrayList<UserBankAccount> accountsOpen = new ArrayList<UserBankAccount>();

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

	public double getBalance() {
		return balance;
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

	public void transferMoney(UserBankAccount a, UserBankAccount b) {

	}

	public void displayAccounts() {

	}

	public void selectOption() {

		System.out.println("Please select an account to work with: ");
		System.out.print("1. Select account \n");
		System.out.print("2. Deposit money \n");
		System.out.print("3. Create new savings bucket \n");
		System.out.println("4. Exit");
		String input = keyboard.nextLine();

		switch (input) {
			case "1":
				System.out.println("Your balance is $" + balance);
				break;
			case "2":
				// System.out.println("Please enter the amount you want to deposit: ");
				// double amount = keyboard.nextDouble();
				depositMoney();
				break;
			case "3":
				System.out.println("Great! How much would you like to transfer?");
				break;
			case "4":
				System.out.println("Have a good day!");
				break;
		}

	}

	public void welcomeMessage() {
		System.out.println("Welcome " + accountHolderFirstName + "!");
		// System.out.println("Your balance is: $" + balance);
		selectOption();
	}

}
