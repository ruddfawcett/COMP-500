public class EquilateralTriangle extends Triangle {
  public EquilateralTriangle(double side) {
    super("EquilateralTriangle", side);
  }

  public abstract double getPerimeter() {
    return side * 3;
  }

  public abstract double getArea() {
    return (Math.sqrt(3) / 4) * side*side;
  }
}
