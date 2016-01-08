public class RectangleTest {
  public static void main(String[] args) {
    Rectangle square = new Rectangle();
    System.out.println("Square:");
    System.out.println(square);

    System.out.println();

    Rectangle rect = new Rectangle(4, 16);
    System.out.println("Rectangle:");
    System.out.println(rect);

    System.out.println();

    rect.quadratize();
    System.out.println("Square?");
    System.out.println(rect);

    Rectangle zeroRect = new Rectangle(10, 0);
    System.out.println("Zero Test:");
    System.out.println(zeroRect);

    System.out.println();
  }
}
