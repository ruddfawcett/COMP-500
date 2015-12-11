public class QuizOne {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4};
    int randIdx = (int)(Math.random() * a.length);

    System.out.println(a[randIdx]);
  }
}
