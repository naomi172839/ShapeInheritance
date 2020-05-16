import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * The menu class creates and shows a menu.
 * The menu class calls ShapeFactory.
 * @author Naomi Bonnin
 * @version 1.0
 * @see ShapeFactory
 */
public class Menu {

    private final Scanner input = new Scanner(System.in);
    private int choice = -1;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("eeee LLLL dd, yyyy HH:mm:ss");

    /**
     * Creates a menu
     */
    public Menu() {
        showMenu();
    }

    /**
     * Shows the menu in the console
     */
    private void showMenu() {
        displayWelcome();
        menuDriver();
    }

    /**
     * Displays the welcome method
     */
    private static void displayWelcome() {
        System.out.println("*********Welcome to the Java OO Shapes Program **********");
    }

    /**
     * Displays the close message
     */
    private void displayClose() {
        System.out.println("Thank you for using this program! ");
        System.out.print("Today is ");
        System.out.println(
                dtf.format(LocalDateTime.now())
        );
    }

    /**
     * Displays the choices to the user
     */
    private static void displayChoices() {
        System.out.println(
                "1. Construct a Circle\n" +
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

    /*
     * Gets the choice input from the user.
     * Ensures validity of input.
     */
    private void getChoice() {
        while(!input.hasNextInt()) {
            System.out.println("Please enter a valid choice");
            input.next();
        }
        choice = input.nextInt();
        while (choice < 1 || choice > 10) {
            System.out.println("Please choose a valid choice");
            choice = input.nextInt();
        }
    }

    /**
     * Displays the continue message.
     * Gets the uses input and passes control back to menuDriver
     */
    private void getContinue() {
        System.out.println("Would you like to continue? [Y/N]");
        while(!input.hasNext()) {
            System.out.println("Please enter a valid choice");
        }
        String con = input.next();
        while(!con.equals("Y") && !con.equals("N")) {
            System.out.println("Please enter a valid choice");
            con = input.next();
        }
        if(con.equals("Y")) {
            choice = -1;
        } else {
            choice = 10;
        }
    }

    /**
     * Loop to drive the menu until told to stop.
     */
    private void menuDriver() {
        while(choice != 10) {
            displayChoices();
            getChoice();
            Shape shape = ShapeFactory.makeShape(choice, input);
            if(choice != 10) {
                getContinue();
            }
        }
        displayClose();
    }

}
