/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

public class Team {
    // Declare fields
    private String teamName;
    private String[] players = new String[20];
    private int playerCount = 0;

    /**
     * Constructor to create instance of Team class with a team name
     * @param teamName String
     */
    public Team(String teamName) {
        this.teamName = teamName;
    }
    
    /**
     * Method to add a new player on the team, if the team already has 20 players, any new request will be ignored
     * @param playerName String
     */
    public void addPlayer(String playerName) {
        // Check if player count is less than 20
        if(playerCount < players.length) {
            // Add player to the team
            players[playerCount] = playerName;
            // Increment player count
            playerCount++;
        }
    }

    /**
     * Get array of all the players on the team
     * @return String
     */
    public String[] getPlayers() {
        return players;
    }

    /**
     * Get player count on the team
     * @return int
     */
    public int getPlayerCount() {
        return playerCount;
    }

    /**
     * Method to return name of the team
     * @return String
     */
    public String getTeamName() {
        return teamName;
    }
}