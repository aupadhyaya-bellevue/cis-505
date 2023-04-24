/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

import java.util.List;
import java.util.Scanner;

public class TestComposerApp {
    public static void main(String[] args) {
        // Create instance of scanner to take user inputs
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Composer App\n");

        // Create instance of the Composer DAO
        MemComposerDao memComposerDao = new MemComposerDao();

        while(true) { // Run a loop until user selects to exit from the program
            System.out.println("MENU OPTIONS");
            System.out.println("\n1. View Composers");
            System.out.println("2. Find Composer");
            System.out.println("3. Add Composer");
            System.out.println("4. Exit\n");

            System.out.print("Please choose an options: ");
            int option = input.nextInt();
            input.nextLine();

            System.out.println();

            if(option == 1) { // User wants to get list of all the composers
                List<Composer> composers = memComposerDao.findAll();
                System.out.println("--DISPLAYING COMPOSERS--");
                for (Composer composer : composers) { // Iterate through all the composers and print
                    System.out.println(composer + "\n");
                }
            } else if(option == 2) { // User wants to get a composer by id
                System.out.print("Enter an id: ");
                int id = input.nextInt();
                input.nextLine();
                Composer composer = memComposerDao.findBy(id);

                if(composer != null) { // Print the composer details if found
                    System.out.println("--DISPLAYING COMPOSER--\n");
                    System.out.println(composer + "\n");
                } else { // Display error if no composer found by id
                    System.out.println("No composer found with id " + id + "\n");
                }                
            } else if(option == 3) { // User wants to add a new composer
                System.out.print("Enter an id: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Enter a name: ");
                String name = input.nextLine();

                System.out.print("Enter a genre: ");
                String genre = input.nextLine();

                memComposerDao.insert(new Composer(id, name, genre));
                System.out.println();
            } else if(option == 4) { // Exit the program
                break;
            }
        }

        System.out.println("\nThank you for using Compose App...");
    }
}
