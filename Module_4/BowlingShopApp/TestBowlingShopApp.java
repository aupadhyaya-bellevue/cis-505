/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

import java.util.Scanner;

public class TestBowlingShopApp {
    /**
     * This method prints Bowling Shop menu
     */
    public static void displayMenu() {
        System.out.println("MENU OPTIONS");
        System.out.println("\t1. <b> Bowling Balls");
        System.out.println("\t2. <a> Bowling Bags");
        System.out.println("\t3. <s> Bowling Shoes");
        System.out.println("\t4. <x> To Exit");
        System.out.print("\nPlease choose an option: ");
    }

    public static void main(String[] args) {
        // Declare scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Variable to hold user input
        String action = "";

        while(true) { // Run an infinite loop until user enters 'x'
            // Display Bowling Ship menu
            displayMenu();

            // Take user input
            action = input.nextLine();

            // If user's input is 'x', exit the loop
            if(action.equalsIgnoreCase("x")) {
                break;
            }

            // Get products from DB and print the listing
            GenericQueue<Product> products = ProductDB.getProducts(action);
            System.out.println("\n--Product Listing--");
            while(products.size() > 0) {
                System.out.println(products.dequeue());
                System.out.println();
            }
        }

        System.out.println("\nEnd of line...");
    }
}
