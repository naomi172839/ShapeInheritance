public class Sphere extends ThreeDimensionalShape {

    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;

    }

    void calculateVolume() {
        //Volume is 4/3 pi r^3
        double vol = (4.0/3.0)*Math.PI*radius*radius*radius;
        this.setVolume(vol);
    }
}
