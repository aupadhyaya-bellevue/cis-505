/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
  
public class TransactionIO {
    // Declare private fields
    private final static String FILE_NAME = "expenses.txt";
    private static File file = new File(FILE_NAME);

    /**
     * This method writes transactions in bulk into a file 
     * @param transactions ArrayList<Transaction>
     * @throws IOException
     */
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null;

        if(file.exists()) { // Check if transactions file already exists
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true)); // Make sure new transactions are appended to existing file
        } else { // If expenses.txt doesn't exist, create a new one
            output = new PrintWriter(FILE_NAME);
        }

        for(Transaction transaction: transactions) {// Iterate through all the transactions and add to expenses.txt
            output.print(transaction.getDate() + " ");
            output.print(transaction.getDescription() + " ");
            output.println(transaction.getAmount());
        }

        output.close();
    }

    /**
     * This method reads all the transactions from expenses.txt and returns the same
     * @return transactions ArrayList<Transaction>
     * @throws IOException
     */
    public static ArrayList<Transaction> findAll() throws IOException {
        ArrayList<Transaction> transactions = new ArrayList<>();
        Scanner input = new Scanner(file);

        while(input.hasNextLine()) { // Read the file until no lines left
            String[] data = input.nextLine().split(" "); // Get all the space deliminated data
            try {
                transactions.add(new Transaction((new SimpleDateFormat("MM-dd-yyyy")).parse(data[0]), 
                                    data[1], 
                                    Double.parseDouble(data[2])));
            } catch(Exception exception) {
                System.out.println("\nException: " + exception.getMessage());
            }
        }

        return transactions;
    }
}
