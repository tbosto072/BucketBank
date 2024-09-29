package bank;

public class BucketAccount extends UserBankAccount {
    String label;
    double bucketBalance;
    int numBuckets;

    public BucketAccount(String l, double bal) {
        label = "";
        bucketBalance = 0.0;
    }

    public void setLabel(String l, double bal) {
        label = l;
    }

    public void createBucket(String l, double bal) {
        BucketAccount b = new BucketAccount(l, bal);
    }

}
