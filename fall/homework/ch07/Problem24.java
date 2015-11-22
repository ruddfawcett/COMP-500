import java.util.Scanner;

public class Problem24 {
  private static final double RIPPLE_UNIT_PRICE = 0.26;

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    while (true) {
      System.out.print("Enter quantity: ");
      int quantity = keyboard.nextInt();
      keyboard.nextLine();

      if (quantity % 25 == 0) {
        System.out.printf("You have ordered %d Ripples  -- $%.2f\n\n", quantity, quantity * RIPPLE_UNIT_PRICE);
      }
      else {
        System.out.println("Riples can only be ordered in packs of 25.");
        System.exit(1);
      }

      System.out.print("Next customer (y/n): ");
      String str = keyboard.nextLine().trim().toLowerCase();
      char nextCustomer = str.length() == 0 ? ' ' : str.charAt(0);

      if (nextCustomer == 'y') {
        continue;
      }
      else if (nextCustomer == 'n') {
        System.exit(1);
      }
      else {

      }
    }
  }

  // public static void
}
