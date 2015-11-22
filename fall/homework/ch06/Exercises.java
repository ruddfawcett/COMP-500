import java.util.Scanner;

public class Exercises {
  public static void main(String[] args) {
    // println(getOrderTotal(6, 6));
    // println(quiz(4, -4));
    bucklePoem();
  }

  private static void println(Object x) {
    System.out.println(x);
  }

  private static void print(Object x) {
    System.out.print(x);
  }

  public static boolean quiz(int x, int z) {
    // return (-x == z);
    return (x == 4 || x*2 %3 == 0 || 2/(x+z) == 0);

    // if (x % 2 == 0) {
    //   println("even");
    // }
    // else {
    //   println("odd");
    // }
    //
    // return true;
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

  /**
   * Problem 5.
   * Fill in the missing code in the `totalWages` method, which calculates
   * the total earnings for a week based on the number of hours worked and
   * the hourly rate. The pay for overtime (hours worked over 40) is 1.5
   * times the regular rate. For example, `totalWages(45, 12.50)` should
   * return 593.75
   *
   * @param   double hours The number of hours worked.
   * @param   double rate The rate of pay per hour
   * @return  The correct wage.
   */
  public static double totalWages(double hours, double rate) {
    double wages = rate * hours;
    if (hours > 40) {
        wages = ((hours - hours % 40) * rate) + (hours % 40 * (rate * 1.5));
    }

    return wages;
  }

  /**
   * Problem 6.
   * Invent three wasy to express the XOR ("exclusive OR") operation in
   * Java (that is, write a Boolean expression that involves two boolean
   * variables which is true if and only if exactly one of the two variables
   * has the value true).
   *
   * @param   a boolean
   * @param   b boolean
   * @return  boolean a XOR b
   */
  public static boolean xor(boolean a, boolean b) {
    return a != b;
    // return ((!a && b) || (a && !b));
    // return a == b ? false : true;
  }

  /**
   * Problem 10.
   *
   * @param  x [description]
   * @return   [description]
   */
  public static boolean rewrite(int x) {
    return ((x > 7) && (Math.sqrt(x) < 3)) ? true : false;
  }

  /**
   * Problem 13.
   *
   * @param  year [description]
   * @return      [description]
   */
  public static boolean isLeapYear(int year) {
    // return ((year % 4 == 0) && (year ));
    //
    // divisable by 4
    //
    return ((year % 100 == 0) && ((year % 4 == 0) || (year % 400 == 0)));
  }

  // public static boolean isWarmWeather() {
  //   boolean warm = false;
  //
  //   if (location.isTropics()) {
  //     warm = true;
  //   } else if (time.getMonth() == 4 || time.getMonth() == 10) {
  //     if (weather.isSunny()) {
  //       warm = true;
  //     }
  //   } else if (location.isNorthernHemisphere()) {
  //     if (time.getMonth() >= 5 && time.getMonth() <= 9) {
  //       warm = true;
  //     }
  //   } else if (location.isSouthernHemisphere()) {
  //     if (time.getMonth() >= 11 || time.getMonth() <= 3) {
  //       warm = true;
  //     }
  //   }
  //
  //   return warm;
  // }

  /**
   * Problem 17.
   *
   *
   * @param   int bp The number of "Be Prepared" books.
   * @param   int nb The number of "Next Best" books.
   * @return  double total of books purchased.
   */
  public static double getOrderTotal(int bp, int nb) {
    double discount = 16.95;
    double best = 20.95;
    double next = 21.95;

    if (bp == 1 && nb == 1) {
      return (2 * 39.95);
    }
    else if (bp + nb >= 12) {
      return (bp * (discount - 0.95)) + (nb * (discount - 0.95));
    }
    else if (bp + nb >= 3) {
      return (bp * discount) + (nb * discount);
    }
    else {
      return (bp * best) + (nb * next);
    }
  }

  public static void bucklePoem() {
    Scanner keyboard = new Scanner(System.in);

    boolean running = true;

    while (running) {
      print("Enter a number 1-10 (or 0 to quit): ");
      int line = keyboard.nextInt();

      switch(line) {
        case 1:
        case 2:
          println("Buckle your shoe");
          break;
        case 3:
        case 4:
          println("Shut the door");
          break;
        case 5:
        case 6:
          println("Pick up sticks");
          break;
        case 7:
        case 8:
          println("Lay them straight");
          break;
        case 9:
        case 10:
          println("Do it again!");
          break;
        case 0:
          println("Bye!");
          running = false;
          break;
        default:
          println("That is not a valid number!");
      }
    }

    keyboard.close();
  }
}
