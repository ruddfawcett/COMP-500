/**
 * Cooney
 * Cooney is a game which has you guess a word rule based on your input.
 *
 * @author  Rudd Fawcett
 * @course  Period 1 AP CS, Dr. Miles
 * @due     2015-11-05
 */

import java.util.Scanner;

/**
 * Class declaration of Cooney.
 */
public class Cooney {
  private static int counter;
  private static Scanner keyboard;

  /**
   * Starts the game.
   */
  public static void run() {
    counter = 0;

    System.out.println("Try to figure out what Cooney likes:\n");
    System.out.println("Cooney likes MOON but he doesn't like SUN");
    System.out.println("Cooney likes SOCCER but he doesn't like HOCKEY");
    System.out.println("Cooney likes SUMMER but he doesn't like SPRING\n");

    keyboard = new Scanner(System.in);

    process();
  }

  /**
   * Stops the game, and closes the scanner.
   */
  public static void stop() {
    keyboard.close();
  }

  /**
   * Handles looping and stops the game if rule is figured out.
   */
  public static void process() {
    while (counter < 5) {
      ask();
    }

    System.out.println("\nI think you got the rule... I quit!");
    System.out.println("Thaanks forr pplaying!");

    stop();
  }

  /**
   * Asks the user for input, and prints out the formatted result.
   */
  public static void ask() {
    System.out.print("Does Cooney like: ");
    String input = keyboard.nextLine();

    String formatted = formattedRule(input);
    System.out.println(formatted);
  }

  /**
   * Formats a string based on whether or not the word obeys the rule.
   * @param  input The word that the user inputted as an answer.
   * @return       The formatted string based on the word's validity.
   */
  public static String formattedRule(String input) {
    if (obeysRule(input)) {
      return "Yes, Cooney likes " + input.toUpperCase() + "\n";
    }
    else {
      return "No, Cooney doesn't like " + input.toUpperCase() + "\n";
    }
  }

  /**
   * Returns whether or not a word is valid.
   * @param  word The user inputted word.
   * @return      The word's validity.
   */
  public static boolean obeysRule(String word) {
    for (int i = 0; i < word.length() - 1; i++) {
      if (word.charAt(i) == word.charAt(i + 1)) {
        counter++;
        return true;
      }
    }

    counter = 0;
    return false;
  }

  public static void main(String[] args) {
    run();
  }
}
