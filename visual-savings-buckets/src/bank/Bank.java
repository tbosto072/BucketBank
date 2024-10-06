package bank;

import java.util.ArrayList;

public class Bank {
    ArrayList<UserBankAccount> accountsOpen;
    ArrayList<BucketAccount> bucketsOpen;

    public Bank() {
        accountsOpen = new ArrayList<UserBankAccount>();
        bucketsOpen = new ArrayList<BucketAccount>();
    }
}
