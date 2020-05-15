public class Circle extends TwoDimensionalShape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
    }

    @Override
    void calculateArea() {
        this.setArea(radius*radius*Math.PI);
    }


}
