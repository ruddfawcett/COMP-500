public class SmallestNum {
  public static void main(String[] args) {

  }

  public int findMin(int[] list, int n) {
    if (n==1) {
      return list[0];
    }

    return Math.min(list[n-1], findMin(list[n-1]));
  }
}
