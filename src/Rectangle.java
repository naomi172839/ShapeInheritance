/**
 * The rectangle class defines a rectangle.
 * The rectangle has a lenght and a width
 * The rectangle is a TwoDimensionalShape with an area
 * @author Naomi Bonnin
 * @version 1.0
 * @see TwoDimensionalShape
 */
public class Rectangle extends TwoDimensionalShape {

    private final double length;
    private final double width;

    /**
     * Creates a new rectangle from the provided variables
     * @param length Represents the length of the rectangle
     * @param width Represents the width of the rectangle
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calculateArea();
    }

    /**
     * Calculates the area of the rectangle.
     * Uses the formula l*w
     */
    void calculateArea() {
        this.setArea(length*width);
    }
}
