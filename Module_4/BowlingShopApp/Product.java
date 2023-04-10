/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

import java.text.NumberFormat;
import java.util.Locale;

public class Product {
    // Declare fields
    private String code;
    private String description;
    private double price;
    
    /**
     * Default constructor to create Product instance
     */
    public Product() {
    }

    /**
     * Accessor method to return product code
     * @return code String
     */
    public String getCode() {
        return code;
    }

    /**
     * Mutator method to set product code
     * @param code String
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Accessor method to set product description
     * @return description String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Mutator method to set product description
     * @param description String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Accessor method to get product price
     * @return price double
     */
    public double getPrice() {
        return price;
    }

    /**
     * Mutator method to set product price
     * @param price double
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Override toString() method to return product details
     */
    @Override
    public String toString() {
        return "Product Code: " + code + "\nDescription: " + description + "\nPrice:" + NumberFormat.getCurrencyInstance(Locale.US).format(price);
    }
}
