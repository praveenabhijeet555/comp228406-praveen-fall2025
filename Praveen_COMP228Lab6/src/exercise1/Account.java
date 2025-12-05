package exercise1;

public class Account {
    private double acct_bal;

    public Account(double acct_bal) {
        this.acct_bal = acct_bal;
    }

    // Synchronize method for deposit operations (thread synchronization)
    public synchronized void deposit(double amtDepsit) {
        acct_bal += amtDepsit;
        System.out.println(Thread.currentThread().getName() + ": Amt Deposited: $" + amtDepsit + "; Balance: $" + acct_bal);
    }

    // Synchronize method for withdrawal operations (thread synchronization)
    public synchronized void withdraw(double amtWithdraw) {
        // Ensure account balance more than withdrawal
        if (acct_bal >= amtWithdraw) {
            acct_bal -= amtWithdraw;
            System.out.println(Thread.currentThread().getName() + ": Amt Withdrawn: $" + amtWithdraw + "; Balance: $" + acct_bal);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Insufficient funds for withdrawal.");
        }
    }
}
