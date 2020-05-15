public abstract class ThreeDimensionalShape extends Shape {

    private double volume;

    public ThreeDimensionalShape() {
        super(3);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
