import java.util.Arrays;

public class Practice {
  public static void main(String[] args) {
    double[][] a = {{1.0}, {1.0, 1.0, 2.0, 3.0}};

    // for (int i = 0; i < a.length; i++) {
    //   a[i] *= 2;
    // }

    // for (double elem : a) {
    //   elem *= 2;
    // }

    System.out.println(product(a));

    System.out.println(Arrays.toString(a));
  }

  public static double product(double[][] a) {
    double product = 1;

    for (double[] row: a) {
      for (double elem: row) {
        product *= elem;
      }
    }

    return product;
  }
}
