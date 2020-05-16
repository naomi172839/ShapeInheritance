public class Torus extends ThreeDimensionalShape {

    private final Circle minor;
    private final Circle major;

    public Torus(double minorRadius, double majorRadius) {
        minor = new Circle(minorRadius);
        major = new Circle(majorRadius);
    }

    @Override
    void calculateVolume() {
        this.setVolume(minor.getArea()*major.getCircumference());
    }
}
