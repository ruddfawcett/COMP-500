public abstract class Triangle {
  public Triangle(String type, double side) {
    this.type = type;
    this.side = side;
  }

  public abstract double getPerimeter();
  public abstract double getArea();

  public double getRatio() {
    return getArea()/getPerimeter();
  }

  public static void main(String[] args) {
    Triangle equilateralTr = new Triangle("equilateral", 12);
    Triangle rightTr = new Triangle("right", 12);
    System.out.println("Equilateral " + equilateralTr.getRatio());
    System.out.println("Right isosceles " + rightTr.getRatio());
  }
}
