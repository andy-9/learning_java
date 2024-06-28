package accounts;

public class DiamondCheckingAccount extends CheckingAccount {
    public DiamondCheckingAccount(final double balance, final double interestRate, final int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    protected int calculateRewardPoints(double cost) {
        int rewards = 0;

        if (cost > 500) {
            rewards += (int) ((cost - 500) * 80);
            cost = 500;
        }
        if (cost > 100) {
            rewards += (int) ((cost - 100) * 65);
            cost = 100;
        }
        rewards += (int) (cost * 40);
        return rewards;
    }
}
