/**
 * Greetings3
 * Asks for the user's first and last name, and calculates their age in dog years!
 *
 * @author  Rudd Fawcett
 * @course  Period 1 AP CS, Dr. Miles
 * @due     2015-09-18
 */

import java.util.Scanner;

public class Greetings3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    print("Enter your first name: ");
    String firstName = keyboard.nextLine();

    print("Enter your last name: ");
    String lastName = keyboard.nextLine();

    println(""); // Some padding
    println("Hi " + firstName + " " + lastName + "!");
    print("How old are you? ");
    int age = keyboard.nextInt();

    println(""); // Some padding
    println("You're " + (age * 7) + " in dog years, ya sly dog.");
  }

  protected static void print(String string) {
    System.out.print(string);
  }

  protected static void println(String string) {
    System.out.println(string);
  }
}
