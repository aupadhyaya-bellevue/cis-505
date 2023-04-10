/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

public class Bag extends Product {
    // Declare the type field with default value as empty string
    private String type = "";
    
    /**
     * Default constructor to create instance of the Bag
     */
    public Bag() {
    }

    /**
     * Accessor method to get the bag type
     * @return type String
     */
    public String getType() {
        return type;
    }

    /**
     * Mutator method to set bag type
     * @param type String
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: " + type;
    }    
}
