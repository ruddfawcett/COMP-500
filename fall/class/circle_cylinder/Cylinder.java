public class Cylinder {
  private Circle base;
  private double height;

  public Cylinder(int r, int h) {
    this.base = new Circle(r);
    this.height = h;
  }

  public double getVolume() {
    return (this.height * this.base.getArea());
  }

  public static void main(String[] args) {

  }
}
