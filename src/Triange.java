public class Triange extends Square{

    public Triange(double length) {
        super(length);
        calculateArea();   //Right Triangle 1/2 area
    }

    void calculateArea() {
        this.setArea(this.getArea()/2);
    }
}
