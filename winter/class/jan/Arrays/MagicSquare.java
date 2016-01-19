import java.util.Arrays;

public class MagicSquare {
  public static void main(String[] args) {
    int[][] square = makeMagicSquare(3);

    for (int[] row : square) {
      System.out.println(Arrays.toString(row));
    }
  }

  public static int[][] makeMagicSquare(int n) {
    int[][] square = new int[n][n];
    square[0][n/2] = 1;

    int row = 0;
    int col = n/2;

    for (int i = 2; i <= n*n; i++) {
      int newRow = row-1;
      if (newRow < 0) {
        newRow = n-1;
      }

      int newCol = col+1;
      if (newCol == n) {
        newCol = 0;
      }
    }

    return square;
  }
}
