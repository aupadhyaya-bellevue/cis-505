/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

public class Ball extends Product {
    // Declare color field
    private String color = "";

    /**
     * Default constructor to create instance of the Ball class
     */
    public Ball() {
    }

    /**
     * Accessor method to get ball color
     * @return color String
     */
    public String getColor() {
        return color;
    }

    /**
     * Mutator method to set color of the ball
     * @param color String
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColor: " + color;
    }    
}
