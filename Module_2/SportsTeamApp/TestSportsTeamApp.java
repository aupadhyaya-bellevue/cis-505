/**
 * CIS505-T301 Intermediate Java Programming (2235-1)
 * Assignment 2.3
 * @Author Abhishek Upadhyaya
 */

import java.util.Scanner;

public class TestSportsTeamApp {
    // Declare main method
    public static void main(String[] args) {
        // Input variable to hold user's action to continue team creation
        String continueProgram = "y";
        
        // Create Scanner class instance to take all the user input
        Scanner input = new Scanner(System.in);

        // Start a while loop to run until user wants to create teams
        while(continueProgram.equalsIgnoreCase("y")) {
            // Ask for all the user inputs
            System.out.print("Enter a team name: ");
            String teamName = input.nextLine();

            System.out.println("Enter the players names:");
            System.out.print("\thint: use commas for multiple players; no spaces>: ");
            String data = input.nextLine();

            // Create instance of Team class based on user input
            Team team = new Team(teamName);

            // Get all the player names in an array from comma separated string
            String[] players = data.split(",");

            // Add all the players to the team
            for(String player: players) {
                team.addPlayer(player);
            }

            // Print results
            System.out.println("\n\n--Team Summary--");
            System.out.println("Number of players in team: " + team.getPlayerCount());
            System.out.print("Players on team: ");
            for(int playerCounter = 0; playerCounter <= team.getPlayerCount() - 1; playerCounter++) {
                System.out.print(team.getPlayers()[playerCounter] + ",");
            }
            System.out.println();

            // Ask user if wants to continue
            System.out.print("Continue? (y/n): ");
            continueProgram = input.nextLine();
        }
    }    
}
