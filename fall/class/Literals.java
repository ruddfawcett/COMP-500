public class Literals {
  public static void main(String[] args) {
    // int binary = 0b1101;
    // int hexadecimal = 0xD;
    // int intt = 13;
    // double doublee =
    //
    // System.out.println(binary);
    // System.out.println(hexadecimal);
    // System.out.println(intt);

    // int number = 51842;
    // int hundreds = (number / 100);
    // hundreds %= 10;
    //
    // System.out.println(hundreds);
    // 
    int number = 32641;
    int hundreds = (number % 1000);
    hundreds /= 100;
    System.out.println(hundreds);
  }
}
