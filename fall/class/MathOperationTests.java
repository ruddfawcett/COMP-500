/**
* MathOperationTests
* Runs basic math operation tests for int, float and double.
*
* @author  Rudd Fawcett
* @version 1.0
* @since   2015-09-25
*/

public class MathOperationTests {
  public static void main(String[] args) {
    // BEGIN int testing.
    println("int Division Test: " + divide(7, 2));
    println("int Multiplication Test: " + multiply(7, 2));
    println("int Addition Test: " + add(7, 2));
    println("int Subtraction Test: " + subtract(7, 2));

    println("");

    // BEGIN float testing.

    println("float Division Test: " + floatDivide(7.5f, 2.3f));
    println("float Multiplication Test: " + floatMultiply(7.5f, 2.3f));
    println("float Addition Test: " + floatAdd(7.5f, 2.3f));
    println("float Subtraction Test: " + floatSubtract(7.5f, 2.3f));

    println("");

    // BEGIN double testing.

    println("double Division Test: " + doubleDivide(7.5, 2.3));
    println("double Multiplication Test: " + doubleMultiply(7.5, 2.3));
    println("double Addition Test: " + doubleAdd(7.5, 2.3));
    println("double Subtraction Test: " + doubleSubtract(7.5, 2.3));
  }

  // HELPERS

  public static void println(Object input) {
    System.out.println(input);
  }

  // INT

  public static int add(int first, int second) {
    return first+second;
  }

  public static int subtract(int first, int second) {
    return first - second;
  }

  public static int divide(int first, int second) {
    return first/second;
  }

  public static int multiply(int first, int second) {
    return first*second;
  }

  // FLOAT

  public static float floatAdd(float first, float second) {
    return first+second;
  }

  public static float floatSubtract(float first, float second) {
    return first - second;
  }

  public static float floatDivide(float first, float second) {
    return first/second;
  }

  public static float floatMultiply(float first, float second) {
    return first*second;
  }

  // DOUBLE

  public static double doubleAdd(double first, double second) {
    return first+second;
  }

  public static double doubleSubtract(double first, double second) {
    return first - second;
  }

  public static double doubleDivide(double first, double second) {
    return first/second;
  }

  public static double doubleMultiply(double first, double second) {
    return first*second;
  }
}
