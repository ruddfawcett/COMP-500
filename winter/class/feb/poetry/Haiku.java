public class Haiku extends Poem {
  public Haiku() {

  }

  public int numLines() {
    return 3;
  }

  public int getSyllables(int k) {
    if (k == 1 || k == 3) {
      return 5;
    }

    return 7;
  }

  public static void main(String[] args) {
    Poem haiku = new Haiku();

    haiku.printRhythm();
  }
}
