package accounts;

public class SilverCheckingAccount extends CheckingAccount {

    public SilverCheckingAccount(final double balance, final double interestRate, final int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    protected int calculateRewardPoints(final double cost) {
        return (int) (cost * 25);
    }
}
