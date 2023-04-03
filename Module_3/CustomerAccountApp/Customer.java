/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

public class Customer {
    // Declare data fields
    private String name;
    private String address;
    private String city;
    private String zip;

    // Define default constrtor
    public Customer() {
    }

    /**
     * Constructor to create instance of a customer using the values provided for data fields
     * @param name String
     * @param address String
     * @param city String
     * @param zip String
     */
    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    /**
     * Accessor method to get customer's name
     * @return name String
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor method to get customer's address
     * @return address String
     */
    public String getAddress() {
        return address;
    }

    /**
     * Accessor method to get customer's city
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * Accessor method to get customer's city
     * @return
     */
    public String getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nCity: " + city + "\nZip: " + zip;
    }
}
