/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

public class Composer {
    // Declare data fields
    private int id;
    private String name;
    private String genre;

    /**
     * Default constructor to create a Composer
     */
    public Composer() {
    }

    /**
     * Constructor with data fields to create a Composer
     */
    public Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    /**
     * Accessor method to get the id of the composer
     * @return id int
     */
    public int getId() {
        return id;
    }

    /**
     * Accessor method to get the name of the composer
     * @return name String
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor method to get the genre of the composer
     * @return genre String
     */
    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\nName: " + name + "\nGenre: " + genre;
    }
}
