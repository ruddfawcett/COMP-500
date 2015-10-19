/**
 * DieTest
 * Can be used to test the entropy of a die roll, based on user defined
 * number of roles.
 *
 * @author  and Rudd Fawcett
 * @course  Period 1 AP CS, Dr. Miles
 * @due     2015-10-20
 */

import java.util.Scanner;

public class DieTest {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("How many times would you like to roll? ");

    int times = keyboard.nextInt();

    testRoll(times);
  }

  private static void testRoll(int times) {
    Die die = new Die();
    for(int i = 1; i <= times; i++) {
      die.roll();
      System.out.println("Roll #" + i + ":\t" + die.getNumDots());
    }
  }
}
