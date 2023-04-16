/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
 

public class TestExpenseTracker {
    public static void main(String[] args) {
        System.out.println("Welcome to the Expense Tracker\n");

        Scanner sc = new Scanner(System.in);

        String continueProgram = "y";
        while("y".equalsIgnoreCase(continueProgram)) {
            int input = ValidatorIO.getInt(sc, menu());

            if(input == 1) {
                try{
                    ArrayList<Transaction> transactions = TransactionIO.findAll();
                    System.out.println("\nMONTHLY EXPENSES\n");

                    for(Transaction transaction: transactions) {
                        System.out.println(transaction + "\n");
                    }
                } catch(IOException exception) {
                    System.out.println("\nException: " + exception.getMessage());
                }
            } else if(input == 2) {
                String addMore = "y";

                ArrayList<Transaction> transactions = new ArrayList<>();

                while("y".equalsIgnoreCase(addMore)) {
                    String description = ValidatorIO.getString(sc, "\nEnter the description: ");
                    double amount = ValidatorIO.getDouble(sc, "Enter the amount: ");

                    Transaction transaction = new Transaction(new Date(), description, amount);

                    transactions.add(transaction);

                    addMore = ValidatorIO.getString(sc, "\nAdd another transaction? (y/n): ");
                }

                try {
                    TransactionIO.bulkInsert(transactions);
                } catch(IOException exception) {
                    System.out.println("\nException: " + exception.getMessage());
                }
            } else if(input == 3) {
                try {
                    ArrayList<Transaction> transactions = TransactionIO.findAll();
                    double total = 0;

                    for(Transaction transaction: transactions) {
                        total += transaction.getAmount();
                    }

                    System.out.printf("\nYour total monthly expense is  $%6.2f \n", total);
                } catch(IOException exception) {
                    System.out.println("\nException: " + exception.getMessage());
                }
            }

            continueProgram = ValidatorIO.getString(sc, "\nContinue? (y/n): ");
            System.out.println();
        }

        System.out.println("\nProgram terminated by the user...");
    }

    private static String menu() {
        return "\nMENU OPTIONS\n" +
                "\t1. View Transaction\n" +
                "\t2. Add Transactions\n" +
                "\t3. View Expense\n" +
                "\nPlease choose an option: ";
    }
}
