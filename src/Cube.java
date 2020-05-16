public class Cube extends ThreeDimensionalShape {

    private final double length;
    private final Square face;

    public Cube(double length) {
        this.face = new Square(length);
        this.length = length;
    }


    @Override
    void calculateVolume() {
        this.setVolume(face.getArea()*length);
    }
}
