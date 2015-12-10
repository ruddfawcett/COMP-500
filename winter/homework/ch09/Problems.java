import java.util.Arrays;

public class Problems {
  // public static void main(String[] args) {
    // 1.a

    // int[] a = {1, 2, 4};

    // 1.b

    // int sum = a[0] + a[1] + a[2];

    // or
    // int sum = 0;
    // for (int i : a) {
    //    sum += a;
    // }
    //
    // System.out.println(a);

    // 2.a
    // False -- 100 elements, ([100])
    // True -- nums[x];
    // True --
    // True -- per spec

    // 3 -- swap
    // swap(a);
    // for (int i : a) {
      // System.out.println(i);
    // }

    // int[] scores = {75, 89, 90, 90, 90};
    // System.out.println(same(scores));
    // scores = new int[]{90, 90, 90, 90, 90};
    // System.out.println(same(scores));

    // HW 12/7 5-7 + 9
  //   getRandomRps();
  //   System.out.println(Arrays.toString(roots(1, -3, 4)));
  //
  //   System.out.println(Arrays.toString(triple(3, 1)));
  //
  //   System.out.println(Arrays.toString(fibonacci(6)));
  // }

  public static void swap(int[] original) {
    int first = original[0];
    original[0] = original[original.length-1];
    original[original.length-1] = first;
  }

  public static boolean same(int[] scores) {
    return scores[0] == scores[scores.length-1];
  }

  // public static boolean arraysEqual(int[] a, int[] b) {
  //   if (a == null || b == null || a.length != b.length)
  // }

  public static void getRandomRps() {
    char[] letters = {'r', 'r', 'r', 'p', 'p', 'p', 'p', 'p', 's', 's', 's', 's', 's', 's'};
    int k = (int)(Math.random() * letters.length);

    System.out.println(letters[k]);
  }

  // Counts the number of numbers before the first zero in an array.
  private static int mysteryCount(int[] v) {
    int count = 0;

    for (int i = 0; i < v.length; i++) {
      if (v[i] != 0) {
        break;
      }
      count++;
    }

    return count;
  }

  public static double[] roots(int a, int b, int c) {
    if (a == 0) {
      throw new IllegalArgumentException("a = 0");
    }

    double x1 = (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
    double x2 = (-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);

    double descrim = (b*b)-(4*a*c);

    if (descrim < 0) {
      return null;
    }

    return new double[]{x1, x2};
  }

  // Pythagorean triple
  public static int[] triple(int m, int n) {
    if (m == n) {
      throw new IllegalArgumentException("m = n");
    }

    if (n > m) {
      int tmp = m;
      m = n;
      n = tmp;
    }

    int a = Math.abs((m*m) - (n*n));
    int b = 2*m*n;
    int c = (m*m) + (n*n);

    return new int[]{a, b, c};
  }

  public static int[] fibonacci(int n) {
    int[] result = new int[n+1];
    result[0] = 0;
    result[1] = 1;
    result[2] = 1;

    for (int k = 3; k < n-3; k++) {
      result[k+1] = result[k-2] + result[k-1];
    }

    return result;
  }

  public static boolean diagnol(int row, int col, int[][] matrix) {
    return (row == col || row + col == matrix.length - 1);
  }

  public static double max(double[][] nums) {
    double max = 0;
    for (double[] row : nums) {
      for (double num : row) {
        if (num > 0 && num > max) {
          max = num;
        }
      }
    }

    return max;
  }

  public static void main(String[] args) {
    double[][] nums = {{1.0, 3.3, 5.4}, {7.6, 8.2, 1.5}};

    System.out.println(max(nums));
  }
}
