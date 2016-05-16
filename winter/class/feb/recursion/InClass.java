public class InClass {
  public static void main(String[] args) {
    // System.out.println(mysterySum(5));
    System.out.println(process("HAVE") + " " + process("FUN"));
  }

  public static int mysterySum(int n) {
    if (n == 0) {
      return 0;
    }
    else {
      return 3+mysterySum(n - 1);
    }
  }

  public static String process(String str) {
    int n = str.length();

    if (n >= 2) {
      int n2 = n/2;
      str = process(str.substring(n2)) + process(str.substring(0, n2));
    }

    return str;
  }
}
