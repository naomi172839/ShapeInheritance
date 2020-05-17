/**
 * The Sphere class represents a sphere object.
 * A Sphere is a ThreeDimensionalShape with a volume.
 * A sphere has a radius.
 */
public class Sphere extends ThreeDimensionalShape {

    private final double radius;

    /**
     * Creates a Sphere objects
     * @param radius    Represents the radius of the sphere
     */
    public Sphere(double radius) {
        super();
        this.radius = radius;
        calculateVolume();

    }

    /**
     * Calculates the volume of the sphere.
     * Uses the formula 4/3 * pi * r^3.
     */
    void calculateVolume() {
        double vol = (4.0/3.0)*Math.PI*radius*radius*radius;
        this.setVolume(vol);
    }
}
