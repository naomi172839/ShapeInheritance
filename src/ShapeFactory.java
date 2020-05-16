import java.util.Scanner;

public class ShapeFactory {

    public static Shape makeShape(int choice, Scanner input) {
        return switch (choice) {
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

    private static Torus makeTorus(Scanner input) {
        System.out.println("Please input the minor radius");
        while(!input.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        double mr = input.nextDouble();
        System.out.println("Please input the major radius");
        while(!input.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        double MR = input.nextDouble();
        Torus t = new Torus(mr, MR);
        System.out.println("The volume of this Torus is: ");
        System.out.println(t.getVolume());
        return t;
    }

    private static Cylinder makeCylinder(Scanner input) {
        System.out.println("Please input a radius");
        while(!input.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        double r = input.nextDouble();
        System.out.println("Please input a height");
        while(!input.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        double h = input.nextDouble();
        Cylinder c = new Cylinder(r,h);
        System.out.println("The volume of this Cylinder is: ");
        System.out.println(c.getVolume());
        return c;
    }

    private static Cone makeCone(Scanner input) {
        System.out.println("Please input a radius");
        while(!input.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        double r = input.nextDouble();
        System.out.println("Please input a height");
        while(!input.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        double h = input.nextDouble();
        Cone c = new Cone(r,h);
        System.out.println("The volume of this Cone is: ");
        System.out.println(c.getVolume());
        return c;
    }

    private static Cube makeCube(Scanner input) {
        System.out.println("Please enter a length");
        while(!input.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        Cube c = new Cube(input.nextDouble());
        System.out.println("The volume of this Cube is: ");
        System.out.println(c.getVolume());
        return c;
    }

    private static Sphere makeSphere(Scanner input) {
        System.out.println("Please enter the Radius");
        while(!input.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        Sphere s = new Sphere(input.nextDouble());
        System.out.println("The volume of this Sphere is: ");
        System.out.println(s.getVolume());
        return s;
    }

    private static Triangle makeTriangle(Scanner input) {
        System.out.println("Please input a length");
        while(!input.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        Triangle t = new Triangle(input.nextDouble());
        System.out.println("The area of this Triangle is: ");
        System.out.println(t.getArea());
        return t;
    }

    private static Square makeSquare(Scanner input) {
        System.out.println("Please input a length");
        while(!input.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        Square s = new Square(input.nextDouble());
        System.out.println("The area of this Square is: ");
        System.out.println(s.getArea());
        return s;
    }

    private static Rectangle makeRectangle(Scanner input) {
        System.out.println("Please input a length");
        while(!input.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        double l = input.nextDouble();
        System.out.println("Please input a width");
        while(!input.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        double w = input.nextDouble();
        Rectangle r = new Rectangle(l,w);
        System.out.println("The area of this Rectangle is: ");
        System.out.println(r.getArea());
        return r;
    }

    private static Circle makeCircle(Scanner input) {
        System.out.println("Please enter the Radius");
        while(!input.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        Circle c = new Circle(input.nextDouble());
        System.out.println("The area of this Circle is: ");
        System.out.println(c.getArea());
        return c;
    }
}
