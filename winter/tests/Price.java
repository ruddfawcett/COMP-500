import java.util.Scanner;

public class Price {
  private int cost;
  private Scanner scanner;

  public Price(int cost) {
    this.cost = cost;
  }

  public int getCost() {
    return cost;
  }

  public int compare(Price other) {
    return cost - other.cost;
  }

  public static void main(String[] args) {
    Price a = new Price(10);
    Price b = new Price(11);

    // a.scanner.nextLine();

    System.out.println(a.compare(b));
  }
}
