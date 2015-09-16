/**
 * Greetings
 * Reads and writes users input in a console.
 *
 * @author  Rudd Fawcett
 * @version 1.0
 * @since   2015-09-16
 */

import java.util.Scanner;

public class Greetings {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter your first name: ");
    String firstName = keyboard.nextLine();

    System.out.print("Enter your last name: ");
    String lastName = keyboard.nextLine();

    System.out.println("Hello, " + firstName + " " + lastName+".");
    System.out.println("Welcome to Java!");

    keyboard.close();
  }
}
