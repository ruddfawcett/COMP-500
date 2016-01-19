import java.util.Arrays;

public class Practice {
  public static void main(String[] args) {
    // double[][] a = {{1.0}, {1.0, 1.0, 2.0, 3.0}};

    // for (int i = 0; i < a.length; i++) {
    //   a[i] *= 2;
    // }

    // for (double elem : a) {
    //   elem *= 2;
    // }

    // System.out.println(product(a));

    int[] wedge = makeWedge(2);

    System.out.println(Arrays.toString(wedge));
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

  public static int[] makeWedge(int n) {
    int numElems = (n*2)-1;
    int midpoint = (numElems/2)+1;
    int[] wedge = new int[numElems];

    for (int k = 0; k < numElems; k++) {
      if (k-1 == midpoint) {
        System.out.printf("K: %d Mid: %d", k, midpoint);
        wedge[midpoint] = k;
        break;
      }

      wedge[k] = k+1;
      wedge[numElems-(k+1)] = wedge[k]-1;
    }

    return wedge;
  }
}
