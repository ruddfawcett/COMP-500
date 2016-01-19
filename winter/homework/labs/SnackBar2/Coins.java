/**
 * Coins
 * Calculates number of coins for number of cents.
 *
 * @author  Rudd Fawcett
 * @course  Period 6 AP CS, Ms. Litvin
 * @due     2016-01-15
 */
public class Coins {
  /**
   * The amount of money from which to calculate the coins.
   */
  private int cents = 0;

  /**
   * Number of quarters calculated from cents.
   */
  private int quarters = 0;
  /**
   * Number of dimes calculated from cents.
   */
  private int dimes = 0;
  /**
   * Number of nickels calculated from cents.
   */
  private int nickels = 0;
  /**
   * Number of pennies calculated from cents.
   */
  private int pennies = 0;

  public Coins(int cents) {
    this.cents = cents;

    while (cents > 0) {
      if (cents - 25 >= 0) {
        cents -= 25;
        quarters++;
        continue;
      }
      else if (cents - 10 >= 0) {
        cents -= 10;
        dimes++;
        continue;
      }
      else if (cents - 5 >= 0) {
        cents -= 5;
        nickels++;
        continue;
      }
      else if (cents - 1 >= 0) {
        cents -= 1;
        pennies++;
        continue;
      }
    }
  }

  /**
   * Number of quarters calculated from cents.
   */
  public int getQuarters() {
    return quarters;
  }
  /**
   * Number of dimes calculated from cents.
   */
  public int getDimes() {
    return dimes;
  }
  /**
   * Number of nickels calculated from cents.
   */
  public int getNickels() {
    return nickels;
  }
  /**
   * Number of pennies calculated from cents.
   */
  public int getPennies() {
    return pennies;
  }

  /**
   * A string which shows the calculated results.
   */
  public String toString() {
    String prefix = cents + "c = ";

    String change = "";

    if (quarters > 0) {
      change += quarters + "q ";
    }

    if (dimes > 0) {
      change += "+ " + dimes + "d ";
    }

    if (nickels > 0) {
      change += "+ " + nickels + "n ";
    }

    if (pennies > 0) {
      change += "+ " + pennies + "p ";
    }

    if (change.charAt(0) == '+') {
      change = change.substring(2);
    }

    return prefix + change;
  }
}
