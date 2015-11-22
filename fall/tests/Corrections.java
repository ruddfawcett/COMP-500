public class Corrections {
  /**
   * Counts the number of zeros in an integer.
   * @param  n The integer for which to count the number of zeros.
   * @return   The number of zeros in the integer.
   */
  public static int numberOfZeros(int n) {
    int zeros = 0;
    if (n == 0) {
      zeros++;
    }

    while (n > 0) {
      if (n % 10 == 0) {
        zeros++;
      }
      n /= 10;
    }

    return zeros;
  }

  public static void main(String[] args) {
    System.out.println("Zeros in 5024036: "  + numberOfZeros(5024036));
    System.out.println("Zeros in 743: "      + numberOfZeros(743));
    System.out.println("Zeros in 0: "        + numberOfZeros(0));
    System.out.println("Zeros in 1061: "     + numberOfZeros(1061));
    System.out.println("Zeros in 230: "      + numberOfZeros(230));
    System.out.println("Zeros in 90012: "    + numberOfZeros(90012));
  }
}
