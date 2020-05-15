import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Menu {

    private final Scanner input = new Scanner(System.in);
    private int choice = -1;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("eeee LLLL dd, yyyy HH:mm:ss");

    public Menu() {
        showMenu();
    }

    private void showMenu() {
        displayWelcome();
        menuDriver();
    }

    private static void displayWelcome() {
        System.out.println("*********Welcome to the Java OO Shapes Program **********");
    }

    private void displayClose() {
        System.out.println("Thank you for using this program! ");
        System.out.print("Today is ");
        System.out.println(
                dtf.format(LocalDateTime.now())
        );
    }

    private static void displayChoices() {
        System.out.println(
                "1. Construct a circle\n" +
                        "2. Construct a Rectangle \n" +
                        "3. Construct a Square\n" +
                        "4. Construct a Triangle\n" +
                        "5. Construct a Sphere \n" +
                        "6. Construct a Cube\n" +
                        "7. Construct a Cone\n" +
                        "8. Construct a Cylinder\n" +
                        "9. Construct a Torus\n" +
                        "10. Exit the Program"
        );
    }

    private void getChoice() {
        choice = input.nextInt();
        while (choice < 1 || choice > 10) {
            System.out.println("Please choose a valid choice");
            choice = input.nextInt();
        }
    }

    private void menuDriver() {
        while(choice != 10) {
            displayChoices();
            getChoice();
            ShapeFactory.makeShape(choice, input);
        }
        displayClose();
    }

}
