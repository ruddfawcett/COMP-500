public class Exercises {
  // public static void main(String[] args) {
  //   // System.out.println(endStar("yes*"));
  //   // System.out.println(endTwoStars("yes**"));
  //   // System.out.print(removeDashes("123-45-6789"));
  //   // System.out.println(formatDate("11/02/2015"));
  //   // System.out.println(scrolled("Miles"));
  //   // System.out.println(negative("101010101010101"));
  //   System.out.println(startsWith("TEST", "TE"));
  //   System.out.println(endsWith("TEST", "ST"));
  // }

  private static boolean endStar(String x) {
    return x.length() > 0 && x.charAt(x.length() - 1) == '*';
  }

  private static boolean endTwoStars(String x) {
    int length = x.length();
    return length > 1 && x.charAt(length - 2) == '*' && x.charAt(length - 1) == '*';
  }

  public static String removeDashes(String x) {
    return x.replace("-", "");
    // return x.substring(0, 3) + x.substring(4, 6) + x.substring(7, 11);
  }

  public static String formatDate(String old) {
    return old.substring(3, 5) + "-" + old.substring(0, 2) + "-" + old.substring(6, 10);
  }

  public static String scrolled(String input) {
    return input.substring(1) + input.substring(0, 1);
  }

  public static String negative(String x) { // 0101010101
    String a = x.replace("0", "~"); // ~1~1~1~1~1
    String b = a.replace("1", "0"); // ~0~0~0~0~0
    String c = b.replace("~", "1"); // 1010101010

    return c;
  }

  public static boolean startsWith(String s, String prefix) {
    return s.substring(0, prefix.length()).equals(prefix);
  }

  public static boolean endsWith(String s, String suffix) {
    return s.substring(suffix.length()).equals(suffix);
  }

  public static boolean isValidISBN(String isbn) {
    isbn.replace("-", "");

    if (isbn.length() != 13) {
      return false;
    }

    int sum = 0;
    int check = 0;

    for (int i = 1; i <= isbn.length(); i++) {
      int digit = Character.digit(isbn.charAt(i - 1), 10);

      if (i % 2 == 0) {
        sum += 3*digit;
      } else {
        sum += digit;
      }

      if (i == isbn.length() - 1) {
        check = i;
      }
    }

    if (sum % 10 == 0) {
      return true;
    }

    return false;
  }

  public static void main(String[] args) {
    System.out.println(isValidISBN("9781594135859"));
  }
}
