/**
 * RippleOrdering
 * Allows you to interact with our rippling ordering system!
 * Order packs only in multiples of 25!
 *
 * @author  Rudd Fawcett
 * @course  Period 1 AP CS, Dr. Miles
 * @due     2015-10-30
 */
import java.util.Scanner;

public class RippleOrdering {
  private static final double RIPPLE_UNIT_PRICE = 0.26;

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    char answer = 'y';

    do {
      if (Character.toLowerCase(answer) == 'y') {
        System.out.print("Enter quantity: ");

        int quantity = keyboard.nextInt();
        keyboard.nextLine();

        if (quantity % 25 == 0) {
          System.out.printf("You have ordered %d Ripples -- $%.2f\n\n", quantity, quantity * RIPPLE_UNIT_PRICE);
        }
        else {
          System.out.println("Ripples can be ordered only in packs of 25.\n");
        }
      }

      System.out.print("Next customer (y/n): ");
      String response = keyboard.nextLine();

      if (response.length() == 1) {
        answer = response.charAt(0);
      }
      else {
        answer = ' ';
      }

      if (Character.toLowerCase(answer) == 'y') {
        System.out.println("");
      }
    }
    while (Character.toLowerCase(answer) != 'n');

    System.out.println("\nThank you for using Ripple Systems.");

    keyboard.close();
  }
}
