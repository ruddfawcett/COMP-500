import java.util.Arrays;

public class Insertion {
  public static void main(String[] args) {
    double[] a = {3.0, 1.0, 4.5, 0.3, 15.0, 2.3};

    insertionSort(a);

    System.out.println(Arrays.toString(a));
  }

  public static void insertionSort(double[] a) {
    for (int n = a.length-1; n > 1; n--) {
      double temp = a[n];
      int i = n;
      while (i < a.length && temp > a[i-1]) {
        a[i] = a[i-1];
        i--;
      }

// enveloping action
// false sense of security
// comfortable, familiar scene, puts the reader at ease
//  bank, post office, etc.
// halooween parties, teen dances, etc.
//

      a[i] = temp;
    }
  }
}
