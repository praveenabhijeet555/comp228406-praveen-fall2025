package exercise1;

public class Transaction implements Runnable {

    private final Account account;
    private final String atm_operation;
    private final double amount;

    public Transaction(Account account, String operation, double amount) {
        this.account = account;
        this.atm_operation = operation;
        this.amount = amount;
    }

    // withdraw and deposit operations (run method)
    @Override
    public void run() {
        if ("deposit".equals(atm_operation)) {
            account.deposit(amount);
        } else if ("withdraw".equals(atm_operation)) {
            account.withdraw(amount);
        }
    }
}
