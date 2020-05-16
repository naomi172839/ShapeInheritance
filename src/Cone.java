public class Cone extends ThreeDimensionalShape{

    private final Circle base;
    private final double height;

    public Cone(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    @Override
    void calculateVolume() {
        this.setVolume((1.0/3.0)*base.getArea()*height);
    }
}
