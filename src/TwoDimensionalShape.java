/**
 * A TwoDimensionalShape is a Shape
 * It has 2 dimensions
 * It has an area
 */
public abstract class TwoDimensionalShape extends Shape {

    private double area;

    /**
     * Creates the TwoDimensionalShape.
     * Abstract, so only callable by super()
     */
    public TwoDimensionalShape() {
        super(2);
    }

    /**
     * Getter for area
     * @return  The area of the shape
     */
    public double getArea() {
        return area;
    }

    /**
     * Setter for area
     * @param area  Represents the new area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * A method to calculate the area.
     * Defined on a class by class basis.
     */
    abstract void calculateArea();
}
