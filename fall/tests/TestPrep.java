public class Test {
  public static void main(String[] args) {
    System.out.println(factorial(4));
    System.out.println(factorial(17));
  }

  public static long factorial(long n) {
    long f = 1;
    for (long k = 1; k <= n; k++) {
      f *= k;
    }

    return f;
  }
}
