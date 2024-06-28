package accounts;

public class GoldCheckingAccount extends CheckingAccount {
    public GoldCheckingAccount(final double balance, final double interestRate, final int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    protected int calculateRewardPoints(final double cost) {
        return (int) (Math.min(cost, 4000) * 50);
    }
}
