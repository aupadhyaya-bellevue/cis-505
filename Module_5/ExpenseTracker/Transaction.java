/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Transaction {
    // Declare all the fields
    private Date date = new Date();
    private String description;
    private double amount;

    /**
     * The default constructor to create instance of the Transaction class
     */
    public Transaction() {
    }
    
    /**
     * Constructor to create instance of the class by passing values for all the data fields
     * @param date java.util.Date
     * @param description String
     * @param amount double
     */
    public Transaction(Date date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    /**
     * Returns date of the transaction in mm-dd-yyyy format
     * @return String
     */
    public String getDate() {
        return (new SimpleDateFormat("MM-dd-yyyy")).format(date);
    }

    /**
     * Set or update date of the transaction
     * @param date java.util.Date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Returns description of the transaction
     * @return description String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set or update description of the transaction
     * @param description String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns transaction amount
     * @return amount double
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Set or update transaction amount
     * @param amount double
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        return "Date: " + (new SimpleDateFormat("MM-dd-yyyy")).format(date) + 
            "\nDescription: " + description + 
            "\nAmount: " + NumberFormat.getCurrencyInstance(Locale.US).format(amount);
    }    
}
