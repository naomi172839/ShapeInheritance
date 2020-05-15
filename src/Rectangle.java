public class Rectangle extends TwoDimensionalShape {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calculateArea();
    }

    @Override
    void calculateArea() {
        this.setArea(length*width);
    }
}
