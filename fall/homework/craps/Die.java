/**
 * Die
 * Handles logic for producing a random die roll, by generating a random
 * number on a per roll basis (from 1-6), and storing that number.
 *
 * @author  Maria Litvin and Rudd Fawcett
 * @course  Period 1 AP CS, Dr. Miles
 * @due     2015-10-20
 */

public class Die {
  private int numDots;

  public void roll() {
    this.numDots = (int)((6 * Math.random()) + 1);
  }

  public int getNumDots() {
    return this.numDots;
  }
}
