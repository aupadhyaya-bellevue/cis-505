/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

public class Shoe extends Product {
    // Declare show size data field
    private double size;
    
    /**
     * Default contructor to create instance of the Shoe class
     */
    public Shoe() {
    }

    /**
     * Accessor method to get show size
     * @return size double
     */
    public double getSize() {
        return size;
    }

    /**
     * Mutator method to set shoe size
     * @param size double
     */
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSize: " + size;
    }    
}
