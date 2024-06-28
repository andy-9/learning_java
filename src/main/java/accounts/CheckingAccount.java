package accounts;

public class CheckingAccount extends Account {
    public int rewardPoints;

    public CheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate); // forward params to constructor in Account.java
        this.rewardPoints = rewardPoints;
    }

    public boolean purchase(double cost) {
        if (cost > balance) {
            return false;
        }

        balance -= cost;
        rewardPoints += calculateRewardPoints(cost);
        return true;
    }

    protected int calculateRewardPoints(final double cost) {
        return (int) (cost * 10);
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

}
