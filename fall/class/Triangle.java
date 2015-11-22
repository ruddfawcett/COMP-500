public class Triangle {
  public static void printRow(int rowNum, int maxRow) {
    for (int a=0; a < maxRow - rowNum; a++) {
      System.out.print(" ");
    }

    for (int a = 0; a < 2*rowNum-1; a++) {
      System.out.print("*");
    }

    System.out.println();
  }

  public static void printTriangle(int numRows) {
    for (int row = 1; row <= numRows; row++) {
      printRow(row, numRows);
    }
  }

  public static void main(String[] args) {
    printTriangle(6);
  }
}
