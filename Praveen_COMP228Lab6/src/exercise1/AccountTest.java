package exercise1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest {
    public static void main(String[] args) {

        double initial_bal = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter initial balance" ));

        Account account = new Account(initial_bal);

        // Transactions array list
        ArrayList<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(account, "withdraw", 325));
        transactions.add(new Transaction(account, "deposit", 375));
        transactions.add(new Transaction(account, "withdraw", 425));
        transactions.add(new Transaction(account, "deposit", 225));

        // Execute fixed number of threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Execute threads
        for (Transaction transaction : transactions) {
            executorService.execute(transaction);
        }

        // Shut down the ExecutorService
        executorService.shutdown();
    }
}
