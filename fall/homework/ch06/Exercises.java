public class Exercises {
  public static void main(String[] args) {
  }

  private static void println(Object x) {
    System.out.println(x);
  }

  /**
   * Problem 2.
   * Write and test a method that returns the value of the larger of the
   * integers `x` and `y` (or either one, if they are equal), but do not
   * use any `Math` methods.
   *
   * @param   x an integer
   * @param   y a second integer
   * @return  The bigger integer.
   */
  public static int max(int x, int y) {
    // return Math.max(x, y);
    return x > y ? x : y;
  }

  /**
   * Problem 3.
   * Write and test a method that returns the value of the largest of three
   * integers `x`, `y` and `z`.
   *
   * @param   x an integer
   * @param   y another integer
   * @param   z a third integer
   * @return  The biggest integer,
   */
  public static int max(int x, int y, int z) {
    // return Math.max((x > y ? x : y), z);
    if (x > y  || z > x) {
      return x > z ? x : z;
    }
    else {
      return y > z ? y : z;
    }
  }

  /**
   * Problem 4.
   * Write a boolean method that checks whether a given postive integer
   * `n` is a perfect square. Use `Math`'s `sqrt` and `round` methods to
   * find the square root of `n`, round it, then square the result and
   * compare it with `n`. Do not use any iterations or recursion
   *
   * @param  x an integer.
   * @return Whether or not it's a perfect square.
   */
  private static boolean isPerfectSquare(int x) {
    int y = Math.round((float)Math.sqrt(x));
    return (y*y == x) ? true : false;
  }
}
