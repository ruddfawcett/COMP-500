public class TestCoins {
  public static void main(String[] args) {
    test(50);
    test(45);
    test(33);
    test(27);
    test(23);
    test(12);
    test(8);
  }

  public static void test(int cents) {
    Coins coins = new Coins(cents);

    System.out.println(coins);
  }
}
