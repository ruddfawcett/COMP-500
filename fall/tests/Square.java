public class Square {
  private int side;

  public Square(int s) {
    this.side = s;
  }

  public int getArea() {
    return this.side * this.side;
  }

  public static void main(String[] args) {
    Square square = new Square(2);

    System.out.println(square.getArea());
  }
}
