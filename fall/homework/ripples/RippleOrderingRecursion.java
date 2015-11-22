import java.util.Scanner;

public class RippleOrdering {
    private static Scanner keyboard;
    private static final double RIPPLE_UNIT_PRICE = 0.26;

    public static void main(String[] args) {
        keyboard = new Scanner(System.in);

        newCustomer();
    }

    public static boolean validQuantity(int quantity) {
        return quantity % 25 == 0;
    }

    public static int existsNextCustomer(String input) {
        char answer;

        if (input.length() == 1) {
            answer = input.charAt(0);
        }
        else {
            answer = ' ';
        }

        if (Character.toLowerCase(answer) == 'y') {
            return 1;
        }
        else if (Character.toLowerCase(answer) == 'n') {
            return -1;
        }
        else {
            return 0;
        }
    }

    public static void newCustomer() {
        System.out.print("Enter quantity: ");
        int quantity = keyboard.nextInt();
        keyboard.nextLine();

        if (validQuantity(quantity)) {
            System.out.printf("You have ordered %d Ripples -- $%.2f\n\n", quantity, RIPPLE_UNIT_PRICE * quantity);
        }
        else {
            System.out.println("Ripples can be ordered only in packs of 25.\n");
        }

        handleNextCustomer();
    }

    public static void handleNextCustomer() {
        System.out.print("Next customer (y/n): ");
        String response = keyboard.nextLine().trim();

        int result = existsNextCustomer(response);

        if (result == 1) {
            System.out.println("");
            newCustomer();
        }
        else if (result == 0) {
            handleNextCustomer();
        }
        else {
            keyboard.close();
            System.out.println("\nThank you for using Ripple Systems.");
        }
    }
}
