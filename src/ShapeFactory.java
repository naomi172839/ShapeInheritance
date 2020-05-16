import java.util.Scanner;

public class ShapeFactory {

    public static Shape makeShape(int choice, Scanner input) {
        return switch (choice) {
            case 1 -> makeCircle(input);
            case 2 -> makeRectangle(input);
            case 3 -> makeSquare(input);
            default -> null;
        };
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
        return new Circle(1);
    }
}
