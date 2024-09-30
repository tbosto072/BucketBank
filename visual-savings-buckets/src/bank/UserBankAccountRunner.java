package bank;

public class UserBankAccountRunner {
	public static void main(String[] args) {
		UserBankAccount main = new UserBankAccount("Checking", "Checking1", 270.21, "Trinity", "Boston");
		main.welcomeMessage();
		main.accountsOpen.add(main);
		main.displayAccounts();
	}
}
