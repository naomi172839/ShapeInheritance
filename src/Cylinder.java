public class Cylinder extends ThreeDimensionalShape {

    private final Circle base;
    private final double height;

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    @Override
    void calculateVolume() {
        this.setVolume(base.getArea()*height);
    }
}
