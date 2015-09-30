/**
 * Problem20
 * Get's the current time and the time of your bus
 * departure and gives you the difference.
 *
 * @author  Rudd Fawcett
 * @version 1.0
 * @since   2015-09-30
 */

import java.util.Scanner;

public class Problem20 {
  public static void main(String[] args) {
    int curHour, curMin, depHour, depMin;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("What is the current hour? ");
    curHour = keyboard.nextInt();
    System.out.print("What is the current minute? ");
    curMin = keyboard.nextInt();
    System.out.print("When does your bus leave in hours? ");
    depHour = keyboard.nextInt();
    System.out.print("When does your bus leave in minutes? ");
    depMin = keyboard.nextInt();

    int waitMin = (depHour * 60 + depMin) - (curHour * 60 + curMin);
    int waitHours = waitMin/60;

    waitMin %= 60;

    String hourString = "hours";
    String minString = "minutes";

    if (waitHours == 1) {
      hourString = "hour";
    }

    if (waitMin == 1) {
      minString = "minute";
    }

    System.out.printf("Your bus leaves in %d %s and %d %s.\n", waitHours, hourString, waitMin, minString);

    keyboard.close();
  }
}
