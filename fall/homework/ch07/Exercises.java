import java.util.Scanner;

public class Exercises {
  public static void main(String[] args) {
    // System.out.println(product(5, 4));
    // System.out.println(alternateHarmonic(999999999));
    // int k = 3;
    // while (k < 50) {
    //   System.out.println(k);
    //   k *= 2;
    //   if (k == 24) {
    //     break;
    //   }
    // }
    //
    // System.out.println("Done, with " + k);
    // problem5();
    // anyNumber(6);
    println("Multiplication Table:");
    multTable();
    println("");
    // printStarTriangle(10);
    println("Checkerboard:");
    printCheckerboard(7, 7);
  }

  public static void println(Object x) {
    System.out.println(x);
  }

  private static boolean alternateHarmonic(int n) {
    double total = 0;

    for (int k = 1; k <= n; k++) {
      if (k % 2 == 0) {
        total -= (double)1/k;
      }
      else {
        total += (double)1/k;
      }
    }

    double log = Math.log(2);

    System.out.println("Result: " + total + " Log: "+log);
    return (log == total);
  }

  private static int product(int a, int b) {
    int result = 0;
    for (int x = 1; x <= a; x++) {
      result += b;
    }

    return result;
  }

  public static void problem5() {
    Scanner kb = new Scanner(System.in);

    System.out.print("Enter a positive integer: ");
    int n = kb.nextInt();
    kb.nextLine();

    System.out.print("Enter a line of text: ");
    String text = kb.nextLine();
    kb.close();

    for (int i = 0; i < n; i++) {
      System.out.println(text);
    }
  }

  public static int months() {
    double percentLearned = 0;
    int months = 0;

    while (percentLearned < .95) {
      percentLearned += (1 - percentLearned) * 0.10;
      months++;
    }

    return months;
  }

  public static int addOdds(int n) {
    int total = 0;
    for (int x = 1; x <= n; x += 2) {
      total += x;
    }

    return total;
  }


  /**
   * Problem 9.  Accumulator loop.
   * @param n [description]
   */
  public static void anyNumber(int n) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a positive integer under 10: ");
    n = keyboard.nextInt();

    if (n > 0 || n >= 10) {
      println("Can't handle your number!");
    }

    String result = "";
    int added = 0;

    for (int i = 1; i <= n; i++) {
      added += i;

      if (i == 1) {
          result = result + i;
      }
      else {
        result = result + " + " +  i;
      }

      if (n == i) {
        result = result + " = " + added;
      }
    }

    println(result);
  }

  public static void multTable() {
    for (int i = 1; i <= 12; i++) {
      for (int k = 1; k <= 12; k++) {
        System.out.print((k*i) + "\t");
      }
      System.out.println("");
    }
  }

  public static void printStarTriangle(int n) {
    //     *     5 spaces 1 star 5 spaces
    //    ***    4 spaces 3 stars 4 spaces
    //   *****
    //  *******
    for (int i = 1; i <= n; i += 2) {
      for (int k = 0; k < ((n - i)/2); k++) {
        System.out.print(" ");
      }

      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }

      System.out.println("");
    }
  }

  public static void printCheckerboard(int rows, int columns) {
    for (int i = 1; i <= rows; i++) {
      for (int k = 1; k <= columns; k++) {
        if ((k + i) % 2 == 0) {
          System.out.print("#");
        }
        else {
          System.out.print("o");
        }
      }

      System.out.println("");
    }
  }
}
