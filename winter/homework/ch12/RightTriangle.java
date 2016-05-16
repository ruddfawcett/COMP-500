public class RightTriangle extends Triangle {
  public RightTriangle(double side) {
    super("RightTriangle", side);
  }

  public abstract double getPerimeter() {
    return side+side + ();
  }

  public abstract double getArea() {
    return (Math.sqrt(3) / 4) * side*side;
  }
}
