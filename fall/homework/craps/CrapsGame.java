/**
 * CrapsGame
 * Implements the logic for a game of craps (handles rolling and stores points).
 *
 * @author  Maria Litvin and Rudd Fawcett
 * @course  Period 1 AP CS, Dr. Miles
 * @due     2015-10-20
 */

public class CrapsGame {
  private int point = 0;

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
   public int processRoll(int total) {
      int result;
      if (this.point == 0) {
        if (total == 7 || total == 11) {
          result = 1;
        }
        else {
          if (total == 2 || total == 3 || total == 12) {
            result = -1;
          }
          else {
            result = 0;
            this.point = total;
          }
        }
      }
      else if (total == this.point) {
        result = 1;
        this.point = 0;
      }
      else if (total == 7) {
        result = -1;
        this.point = 0;
      }
      else {
        result = 0;
      }

      return result;
    }

  /**
   *  Returns the saved point
   */
  public int getPoint() {
    return this.point;
  }
}
