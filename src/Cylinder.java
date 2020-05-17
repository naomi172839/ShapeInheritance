/**
 * The cylinder class defines a cylinder.
 * The cylinder object has a base and a height.
 * The cylinder object has a volume.
 * @author Naomi Bonnin
 * @version 1.0
 * @see Circle
 * @see ThreeDimensionalShape
 */
public class Cylinder extends ThreeDimensionalShape {

    private final Circle base;
    private final double height;

    /**
     * Makes a new cylinder from the provided variables.
     * @param height Represents the height of the cylinder.
     * @param radius Represents the radius of the base.
     */
    public Cylinder(double radius, double height) {
        super();
        this.base = new Circle(radius);
        this.height = height;
        calculateVolume();
    }

    /**
     * Calculates the volume of the cylinder.
     * Uses the formula pi*r^2*h
     */
    void calculateVolume() {
        this.setVolume(base.getArea()*height);
    }
}
