public class Triangle extends Square{

    public Triangle(double length) {
        super(length);
        super.calculateArea();
        calculateArea();   //Right Triangle 1/2 area
    }

    void calculateArea() {
        this.setArea(this.getArea()/2);
    }
}
