public class Circle extends TwoDimensionalShape {

    private final double radius;
    private double circumference;

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
        calculateCircumference();
    }

    @Override
    void calculateArea() {
        this.setArea(radius*radius*Math.PI);
    }

    public void calculateCircumference() {
        this.circumference = 2*Math.PI*radius;
    }

    public double getCircumference() {
        return circumference;
    }
}
