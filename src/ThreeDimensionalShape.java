/**
 * A ThreeDimensionalShape is a Shape.
 * It has 3 dimensions.
 * It has a volume.
 */
public abstract class ThreeDimensionalShape extends Shape {

    private double volume;

    /**
     * Creates a ThreeDimensionalShape.
     * Class is abstract, only callable as super()
     */
    public ThreeDimensionalShape() {
        super(3);
    }

    /**
     * Getter for volume
     * @return  The volume of the shape
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Setter for volume
     * @param volume    Represents the new volume of the shape
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * A method for determining the volume of a shape.
     * Must be defined on a class by class basis.
     */
    abstract void calculateVolume();
}
