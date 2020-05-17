/**
 * The circle class defines a circle.
 * The circle class tracks two properties: Radius and Circumference.
 * In addition, circle is a TwoDimensionalShape so it has an area.
 * @author Naomi Bonnin
 * @version 1.0
 * @see TwoDimensionalShape
 */

public class Circle extends TwoDimensionalShape {

    private final double radius;
    private double circumference;

    /**
     * Makes a circle from the given radius.
     * @param radius The radius of the circle
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
        calculateArea();
        calculateCircumference();
    }

    /**
     * Calculates the area of a given circle.
     * Uses the formula pi*r^2
     */
    @Override
    void calculateArea() {
        this.setArea(radius*radius*Math.PI);
    }

    /**
     * Calculates the circumference of a circle.
     * Uses the formula 2*pi*r
     */
    public void calculateCircumference() {
        this.circumference = 2*Math.PI*radius;
    }

    /**
     * Standard getter for the circumference of a circle.
     * @return      The circumference of the circle
     */
    public double getCircumference() {
        return circumference;
    }
}
