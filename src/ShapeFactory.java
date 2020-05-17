import java.util.Scanner;

/**
 * The ShapeFactory class is based off of the factory design pattern from the GOF.
 * Though the retuned object is not used in this project, it is still kept as a factory method.
 * This allows code reuse in the event the program is expanded upon.
 */
public class ShapeFactory {

    /**
     * Creates a shape based off of user input.
     * @param choice Represents the shape the user wants to create.
     * @param input Represents the Scanner used to get additional input.
     * @return      The chosen shape object
     */
    public static Shape makeShape(int choice, Scanner input) {
        return switch (choice) {    //Enhanced switch statement
            case 1 -> makeCircle(input);
            case 2 -> makeRectangle(input);
            case 3 -> makeSquare(input);
            case 4 -> makeTriangle(input);
            case 5 -> makeSphere(input);
            case 6 -> makeCube(input);
            case 7 -> makeCone(input);
            case 8 -> makeCylinder(input);
            case 9 -> makeTorus(input);
            default -> null;
        };
    }

    /**
     * Creates a Torus object
     * @param input Represents the scanner to receive user input
     * @return      A Torus object based off of user input
     */
    private static Torus makeTorus(Scanner input) {
        System.out.println("Please input the minor radius");
        while(!input.hasNextDouble()) { //Check if the user entered a double
            System.out.println("Please enter a valid number");
            input.next();
        }
        double mr = input.nextDouble(); //Gets the user entered value
        System.out.println("Please input the major radius");
        while(!input.hasNextDouble()) { //Checks if the user entered a double
            System.out.println("Please enter a valid number");
            input.next();
        }
        double MR = input.nextDouble(); //Gets the user entered value
        Torus t = new Torus(mr, MR);    //Creates a Torus from the supplied values
        System.out.println("The volume of this Torus is: ");
        System.out.println(t.getVolume());  //Prints the volume
        return t;
    }

    /**
     * Creates a Cylinder object.
     * @param input Represents the Scanner to receive user input.
     * @return      A Cylinder object based off of user input.
     */
    private static Cylinder makeCylinder(Scanner input) {
        System.out.println("Please input a radius");
        while(!input.hasNextDouble()) { //Check for correct type
            System.out.println("Please enter a valid number");
            input.next();
        }
        double r = input.nextDouble();  //Get radius
        System.out.println("Please input a height");
        while(!input.hasNextDouble()) { //Check for correct type
            System.out.println("Please enter a valid number");
            input.next();
        }
        double h = input.nextDouble();  //Get height
        Cylinder c = new Cylinder(r,h); //Create Cylinder object
        System.out.println("The volume of this Cylinder is: ");
        System.out.println(c.getVolume());  //Prints the volume
        return c;
    }

    /**
     * Creates a Cone object.
     * @param input Represents the Scanner to receive user input.
     * @return      A Cone object
     */
    private static Cone makeCone(Scanner input) {
        System.out.println("Please input a radius");
        while(!input.hasNextDouble()) { //Type checking
            System.out.println("Please enter a valid number");
            input.next();
        }
        double r = input.nextDouble();  //Get value
        System.out.println("Please input a height");
        while(!input.hasNextDouble()) { //Type checking
            System.out.println("Please enter a valid number");
            input.next();
        }
        double h = input.nextDouble();  //Get value
        Cone c = new Cone(r,h);     //Creates object
        System.out.println("The volume of this Cone is: ");
        System.out.println(c.getVolume());  //Prints volume
        return c;
    }

    /**
     * Creates a Cube object.
     * @param input Represents the Scanner to receive user input
     * @return      A Cube object
     */
    private static Cube makeCube(Scanner input) {
        System.out.println("Please enter a length");
        while(!input.hasNextDouble()) {     //Type checking
            System.out.println("Please enter a valid number");
            input.next();
        }
        Cube c = new Cube(input.nextDouble());  //Gets value and creates a cube
        System.out.println("The volume of this Cube is: ");
        System.out.println(c.getVolume());  //Prints the volume
        return c;
    }

    /**
     * Creates a Sphere object.
     * @param input Represents the scanner to receive user input.
     * @return      A Sphere object.
     */
    private static Sphere makeSphere(Scanner input) {
        System.out.println("Please enter the Radius");
        while(!input.hasNextDouble()) { //Type checking
            System.out.println("Please enter a valid number");
            input.next();
        }
        Sphere s = new Sphere(input.nextDouble());  //Get radius and create sphere
        System.out.println("The volume of this Sphere is: ");
        System.out.println(s.getVolume());  //Prints the volume
        return s;
    }

    /**
     * Creates a triangle object.
     * @param input Represents the Scanner to get user input
     * @return      Returns the Traingle object
     */
    private static Triangle makeTriangle(Scanner input) {
        System.out.println("Please input a length");
        while(!input.hasNextDouble()) { //Type checking
            System.out.println("Please enter a valid number");
            input.next();
        }
        Triangle t = new Triangle(input.nextDouble());  //Get length and create triangle
        System.out.println("The area of this Triangle is: ");
        System.out.println(t.getArea());    //Prints the area
        return t;
    }

    /**
     * Creates a Square object
     * @param input Represents the scanner to recieve user input
     * @return      A Square object
     */
    private static Square makeSquare(Scanner input) {
        System.out.println("Please input a length");
        while(!input.hasNextDouble()) { //Type checking
            System.out.println("Please enter a valid number");
            input.next();
        }
        Square s = new Square(input.nextDouble());  //Get length and create Square
        System.out.println("The area of this Square is: ");
        System.out.println(s.getArea());    //Print the area
        return s;
    }

    /**
     * Creates a Rectangle object
     * @param input Represents the scanner to receive user input
     * @return      A Rectangle object
     */
    private static Rectangle makeRectangle(Scanner input) {
        System.out.println("Please input a length");
        while(!input.hasNextDouble()) { //Type checking
            System.out.println("Please enter a valid number");
            input.next();
        }
        double l = input.nextDouble();  //Get value
        System.out.println("Please input a width");
        while(!input.hasNextDouble()) { //Type checking
            System.out.println("Please enter a valid number");
            input.next();
        }
        double w = input.nextDouble();  //Get value
        Rectangle r = new Rectangle(l,w);   //Create rectangle
        System.out.println("The area of this Rectangle is: ");
        System.out.println(r.getArea());    //Print area
        return r;
    }

    /**
     * Creates a circle object
     * @param input Represents a Circle object
     * @return      A Circle object
     */
    private static Circle makeCircle(Scanner input) {
        System.out.println("Please enter the Radius");
        while(!input.hasNextDouble()) { //Type checking
            System.out.println("Please enter a valid number");
            input.next();
        }
        Circle c = new Circle(input.nextDouble());  //Get value and create circle
        System.out.println("The area of this Circle is: ");
        System.out.println(c.getArea());    //Prints area
        return c;
    }
}
