/**
 * The cone class defines a cone.
 * The cone class tracks two items: a Circle as its base and a double as its height.
 * The cone class has a volume inherited from TwoDimensionalShape.
 * The cone is assumed to be a perfect cone with its tip at the midpoint of its base.
 * @author Naomi Bonnin
 * @version 1.0
 * @see Circle
 * @see TwoDimensionalShape
 */
public class Cone extends ThreeDimensionalShape{

    private final Circle base;
    private final double height;

    /**
     * Creates a cone.
     * @param radius Represents the radius of the cones base
     * @param height Represents the height of the cone
     */
    public Cone(double radius, double height) {
        super();
        this.base = new Circle(radius);
        this.height = height;
        calculateVolume();
    }

    /**
     * Calculates the volume of the given cone.
     * Uses the formula (1/3)*pi*r^2*h.
     */
    void calculateVolume() {
        this.setVolume((1.0/3.0)*base.getArea()*height);
    }
}
