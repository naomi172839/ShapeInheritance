/**
 * The cube class defines a cube.
 * The cube class has a length and a face.
 * The cube class is a ThreeDimensionalShape.
 * The cube class has a volume.
 * @author Naomi Bonnin
 * @version 1.0
 * @see Square
 * @see TwoDimensionalShape
 */
public class Cube extends ThreeDimensionalShape {

    private final double length;
    private final Square face;

    /**
     * Creates a cube from a given side length
     * @param length Represents the length of one side of the cube.
     */
    public Cube(double length) {
        super();
        this.face = new Square(length);
        this.length = length;
        calculateVolume();
    }

    /**
     * Calculates the volume of the cube.
     */
    void calculateVolume() {
        this.setVolume(face.getArea()*length);
    }
}
