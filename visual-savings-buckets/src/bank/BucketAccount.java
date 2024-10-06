package bank;

public class BucketAccount extends UserBankAccount {
    static String label;
    static double bucketBalance;

    public BucketAccount(String l, double bal) {
        label = l;
        bucketBalance = bal;
    }

    public void setLabel(String l, double bal) {
        label = l;
    }

    public static String getBucketLabel() {
        return label;
    }

    public static double getBucketBalance() {
        return bucketBalance;
    }

    public void createBucket(String l, double bal) {
        BucketAccount b = new BucketAccount(l, bal);
    }

    public static void displayBuckets() {
        System.out.println("\\     " + getBucketLabel() + "       /");
        System.out.println(" \\                 /");
        System.out.println("  \\    " + getBucketBalance() + "     /");
        System.out.println("    +------------+");
    }

    public static void main(String[] args) {
        BucketAccount testAcc = new BucketAccount("Beyonce", 179.81);
        displayBuckets();
    }
}
