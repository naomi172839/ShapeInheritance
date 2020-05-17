/**
 * A Torus is a ThreeDimensionalShape.
 * A Torus has a major circle and a minor circle
 * A Torus has a volume
 */
public class Torus extends ThreeDimensionalShape {

    private final Circle minor;
    private final Circle major;

    /**
     * Creates a torus object
     * @param minorRadius   Represents the radius of the minor circle
     * @param majorRadius   Represents the radius of the major circle
     */
    public Torus(double minorRadius, double majorRadius) {
        minor = new Circle(minorRadius);
        major = new Circle(majorRadius);
        calculateVolume();
    }

    /**
     * Calculates the volume of the torus.
     * Uses the formula pi * minorRadius^2 * 2 * pi * majorRadius
     */
    void calculateVolume() {
        this.setVolume(minor.getArea()*major.getCircumference());
    }
}
