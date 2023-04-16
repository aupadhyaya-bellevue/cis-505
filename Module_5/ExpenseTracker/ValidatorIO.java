/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

import java.util.Scanner;

public class ValidatorIO {
    /**
     * This method requests an integer input, validates and returns the same. Will print an error if non-int value entered
     * @param sc java.util.Scanner
     * @param prompt String
     * @return int
     */
    public static int getInt(Scanner sc, String prompt) {
        int input = 0;

        boolean isValid = false;

        while(!isValid) {// Continue the loop until user enters a valid int value
            System.out.print(prompt);

            if(sc.hasNextInt()) { // Check if user's input is an int value
                input = sc.nextInt();
                // Set isValid variable to true to break the loop
                isValid = true;
            } else { // Display an error if user's input is not an int value
                System.out.println("\n  Error! Invalid integer value.\n");
            }
            sc.nextLine();
        }

        return input;
    }

    /**
     * This method requests a double input, validates and returns the same. Will print an error if non-double value entered
     * @param sc java.util.Scanner
     * @param prompt String
     * @return double
     */
    public static double getDouble(Scanner sc, String prompt) {
        double input = 0;

        boolean isValid = false;

        while(!isValid) {// Continue the loop until user enters a valid double value
            System.out.print(prompt);

            if(sc.hasNextDouble()) { // Check if user's input is a double value
                input = sc.nextDouble();
                // Set isValid variable to true to break the loop
                isValid = true;
            } else { // Display an error if user's input is not a double value
                System.out.println("\n  Error! Invalid integer value.\n");
            }
            sc.nextLine();
        }

        return input;
    }

    /**
     * This method requests a String input and returns the same
     * @param sc java.util.Scanner
     * @param prompt String
     * @return String
     */
    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
}
