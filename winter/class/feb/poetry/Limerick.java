public class Limerick extends Poem {
  public Limerick() {

  }

  public int numLines() {
    return 5;
  }

  public int getSyllables(int k) {
    if (k == 3 || k == 4) {
      return 6;
    }

    return 9;
  }

  public static void main(String[] args) {
    Poem limerick = new Limerick();

    limerick.printRhythm();
  }
}
