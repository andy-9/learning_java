import accounts.Account;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(100, 0.025);
        account.status();
        account.withdraw(45.86);
        account.status();
        account.withdraw(62.96);
        account.status();
        account.deposit(32.50);
        account.status();
    }
}
