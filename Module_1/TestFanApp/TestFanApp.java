/**
 * CIS505-T301 Intermediate Java Programming (2235-1)
 * Assignment 1.3
 * @Author Abhishek Upadhyaya
 */

public class TestFanApp {

    // Declare main method
    public static void main(String[] args) {
        // Create instance of Fan class using default constructor and print
        Fan fan1 = new Fan();
        System.out.println(fan1);

        System.out.println();

        // Create instance of Fan class using constructor by passing arcuments and print
        Fan fan2 = new Fan(Fan.MEDIUM, true, 8, "Blue");
        System.out.println(fan2);
    }
    
}
