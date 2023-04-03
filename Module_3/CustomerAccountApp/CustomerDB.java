/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

public class CustomerDB {
    /**
     * This method returns object of the Customer class based on the id if matched, a default Customer object otherwise 
     * @param id int
     * @return customer Customer
     */
    public static Customer getCustomer(int id) {
        if(id == 1007) {
            return new Customer("Customer 1007", "123 Main Street", "Plano", "75024");
        } else if(id == 1008) {
            return new Customer("Customer 1008", "345 One Street", "Frisco", "75035");
        } else if(id == 1009) {
            return new Customer("Customer 1009", "1217 Some Street", "Little Elm", "75068");
        } else {
            return new Customer();
        }
    }
}
