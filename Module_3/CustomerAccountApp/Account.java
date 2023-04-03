/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private double balance = 200;

    /**
     * This method returns running balance of the account
     * @return balance double
     */
    public double getBalance() {
        return balance;
    }

    /**
     * This method adds amount to running balance of the account
     * @param amount double
     */
    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
        }
    }

    /**
     * This method withdraws from the account if requested amount is equals to or less than running balance
     * @param amount double
     */
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance = balance - amount;
        }
    }

    /**
     * This method prints account menu
     */
    public void displayMenu() {
        System.out.println("Account Menu");
        System.out.println("Enter <D/d> for deposit");
        System.out.println("Enter <W/w> for withdraw");
        System.out.println("Enter <B/b> for balance");
    }

    /**
     * This method returns last transaction data in MM-dd-yyyy format
     * @return date String
     */
    public String getTransactionDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        return formatter.format(new Date());
    }
}
