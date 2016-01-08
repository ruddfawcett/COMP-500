/**
 * Rectangle
 * Constructs a rectangle.
 *
 * @author  Rudd Fawcett
 * @course  Period 6 AP CS, Ms. Litvin
 * @due     2015-12-07
 */
public class Rectangle {
  /**
   * The width of the rectangle.
   */
  private int width;
  /**
   * The height of the rectangle.
   */
  private int height;

  /**
   * Constructs a 1x1 square.
   */
  public Rectangle() {
    this(1, 1);
  }

  /**
   * Constructs a square with a given side length.
   */
  public Rectangle(int s) {
    this(s, s);
  }

  /**
   * Constructs a rectangle with a width and height.
   */
  public Rectangle(int w, int h) {
    if (w <= 0 || h <= 0) {
      throw new IllegalArgumentException("You can't have a rectangle with a zero side length!");
    }

    this.width = w;
    this.height = h;
  }

  /**
   * Returns whether the rectangle is a square.
   */
  public boolean isSquare() {
    return width == height;
  }

  /**
   * Makes the rectangle into a square with roughly the same area.
   */
  public void quadratize() {
    int area = width * height;
    int side = (int)Math.sqrt(area);

    width = side;
    height = side;
  }

  /**
   * Gives the current properties of the rectangle.
   */
  public String toString() {
    return "Rectangle: width=" + width + ", height=" + height;
  }
}
