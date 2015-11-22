/**
 * MyRectangle
 * Test 3 Corrections: Problem #13
 *
 * @author  Rudd Fawcett
 * @course  Period 1 AP CS, Dr. Miles
 * @due     2015-11-07
 */

/*
        (0,0)  -- -- -- -- -- -- --  (7, 0)
             |                      |
             |                      |
             |                      |
             |                 .    | <-- (4, 6)
             |                      |
       (0,5)   -- -- -- -- -- -- --  (7, 5)
*/

public class MyRectangle {
  /**
   * Top, botom, left, and right bounds of the rectangle.
   */
  private int top, bottom, left, right;

  /**
   * Constructor for rectangle.
   * @param   top    The top bounds of the rectangle.
   * @param   bottom The bottom bounds of the rectangle.
   * @param   left   The left bounds of the rectangle.
   * @param   right  The right bounds of the rectangle.
   * @return  A new rectangle.
   */
  public MyRectangle(int top, int bottom, int left, int right) {
    this.top = top;
    this.bottom = bottom;
    this.left = left;
    this.right = right;
  }

  /**
   * Makes sure rectangle doesn't have illegal bounds.
   * @return Whether or not the rectangle is empty.
   */
  public boolean isEmpty() {
    return top >= bottom || left >= right;
  }

  /**
   * Whether or not the rectangle contains a point (or if it's on the border_).
   * @param   x The x coordinate of the point.
   * @param   y The y coordinate of the point.
   * @return  Whether or not the rectangle contains a point/the point is on the border.
   */
  public boolean isInside(int x, int y) {
    return !isEmpty() && (x <= right && x >= left) && (y >= top && y <= bottom);
  }

 /**
  * Getter for top bound.
  * @return Top bound.
  */
  public int getTop() {
    return top;
  }

  /**
   * Getter for bottom bound.
   * @return Bottom bound.
   */
  public int getBottom() {
    return bottom;
  }

  /**
   * Getter for left bound.
   * @return Left bound.
   */
  public int getLeft() {
    return left;
  }

  /**
   * Getter for right bound.
   * @return Right bound.
   */
  public int getRight() {
    return right;
  }

  public static void main(String[] args) {
    MyRectangle rect = new MyRectangle(0, 5, 0, 7);

    System.out.println("Rectanble bounds: " + rect.getTop() + ", " +  rect.getBottom() + ", " + rect.getLeft() + ", " + rect.getRight());
    System.out.println("Is the rectanble empty? " + rect.isEmpty());
    System.out.println("Is the point (3, 2) inside or on the border of the rectangle? " + rect.isInside(3, 2));
    System.out.println("Is the point (7, 5) inside or on the border of the rectangle? " + rect.isInside(7, 5));
    System.out.println("Is the point (7, 6) inside the rectangle? " + rect.isInside(7, 6));
  }
}
