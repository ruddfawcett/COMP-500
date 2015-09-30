public class Problem16 {
  public static void main(String[] args) {
    int dayOfWeek1 = 0;
    int day = 13;

    int dayOfWeek = (dayOfWeek1 + day - 1) % 7;

    System.out.println(dayOfWeek);
  }
}
