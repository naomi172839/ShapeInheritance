/**
 * The shape class defines a shape with n-dimensions.
 * The shape class is abstract and can only be inherited
 * @author Naomi Bonnin
 * @version 1.0
 */
public abstract class Shape {

    private final int dimensions;

    /**
     * Creates a shape with n-dimensions
     * @param dimensions Represents the dimensionality of the shape
     */
    public Shape(int dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * Getter for dimensions.
     * @return          The number of dimensions
     */
    public int getDimensions() {
        return dimensions;
    }
}
