/**
 * The triangle class is a special type of square.
 * It defines only a 90-45-45 triangle.
 * By definition, the length of the two sides are equal as a square is.
 * It's area, therefor is 1/2 the area of the square represented by the same side length.
 * By definition, a triangle is also a special rectangle.
 * A Triangle is a TwoDimensionalShape and has an area
 */
public class Triangle extends Square{

    /**
     * Creates a 90-45-45 triangle
     * @param length    Represents the length of the non hypotenuse sides
     */
    public Triangle(double length) {
        super(length);  //Creates the square
        super.calculateArea();  //Calculates the area of the whole square
        calculateArea();   //Right Triangle 1/2 area
    }

    /**
     * Calculates the area of the triangle.
     * Uses the formula 1/2 * base * height where base and height are equal.
     */
    void calculateArea() {
        this.setArea(this.getArea()/2);
    }
}
