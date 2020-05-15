public abstract class TwoDimensionalShape extends Shape {

    private double area;

    public TwoDimensionalShape() {
        super(2);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    abstract void calculateArea();
}
