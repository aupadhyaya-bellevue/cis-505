/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

public class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = STOPPED;
    private boolean running = false;
    private double radius = 6;
    private String color = "White";

    /**
     * Default constructor which will create Fan instance with default values
     */
    public Fan() {
    }
    
    /**
     * Fan class constructor to create instance with provided values
     * @param speed int
     * @param running boolean
     * @param radius double
     * @param color String
     */
    public Fan(int speed, boolean running, double radius, String color) {
        this.speed = speed;
        this.running = running;
        this.radius = radius;
        this.color = color;
    }

    /**
     * The accessor method to get speed of the current instance of Fan
     * @return speed int
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Setter to update speed of the fan
     * @param speed int
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * The accessor method to get if the current instance of the fan is running
     * @return running boolean
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * Setter to update status of the fan
     * @param running
     */
    public void setRunning(boolean running) {
        this.running = running;
    }

    /**
     * The accessor method to get speed of the current instance of Fan
     * @return radius double
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Setter to update radius of the fan
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * The accessor method to get color of the current instance of Fan
     * @return color String
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter to update color of the fan
     * @param color String
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(running) { // If the fan is running, print speed, color and radius of the fan
            return "The fan speed is set to " + speed + " with a color of " + color + " and a radius of " + radius;
        } else { // If the fan is not running, print the color and radius of the fan with message that the fan is off
            return "The fan is " + color + " with a radius of " + radius + " and the fan is off";
        }
    }    
}
