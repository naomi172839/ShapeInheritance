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
        return new Square(1);
    }

    private static Rectangle makeRectangle(Scanner input) {
        return new Rectangle(1,1);
    }

    private static Circle makeCircle(Scanner input) {
        return new Circle(1);
    }
}
