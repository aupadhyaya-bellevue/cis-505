/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class TestCustomerAccountApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Customer Account App");

        // Create instance of scanner class to take user's input
        Scanner input = new Scanner(System.in);

        // Ask user to enter customer id
        System.out.println("Enter a customer ID:");
        System.out.print("\tex: 1007, 1008, 1009>: ");
        String customerId = input.nextLine();

        System.out.println();

        // Get customer by id
        Customer customer = CustomerDB.getCustomer(Integer.parseInt(customerId));

        // Create instance of account class to support all the operations
        Account account = new Account();

        // Input variable to hold user's action to continue team creation
        String continueApp = "y";

        while("y".equalsIgnoreCase(continueApp)) {
            // Display account menu and ask user to enter an option
            account.displayMenu();
            System.out.print("\tEnter option>: ");
            String option = input.nextLine();

            System.out.println();

            if("d".equalsIgnoreCase(option)) { // User wants to deposit an amount to the account
                System.out.print("Enter deposit amount: ");
                String amount = input.nextLine();
                account.deposit(Double.parseDouble(amount));
            } else if("w".equalsIgnoreCase(option)) { // User wants to withdraw an amount from the account
                System.out.print("Enter withdraw amount: ");
                String amount = input.nextLine();
                account.withdraw(Double.parseDouble(amount));
            } else if("b".equalsIgnoreCase(option)) { // User wants to check balance
                System.out.printf("Account balance: $%,6.2f", account.getBalance());
            } else { // User enters an invalid option
                System.out.println("Error: Invalid option");
            }
            System.out.print("\nContinue? (y/n): ");
            continueApp = input.nextLine();
            System.out.println();
        }

        // Display customer details and exit the program
        System.out.println("--Customer Details--");
        System.out.println(customer);
        System.out.println();
        System.out.printf("Balance as of %s is $%,6.2f\n", account.getTransactionDate(), account.getBalance());
        System.out.println();
        System.out.println("End of line...");
    }
}
