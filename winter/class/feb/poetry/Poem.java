public abstract class Poem {
  public abstract int numLines();
  public abstract int getSyllables(int k);

  public void printRhythm() {
    for (int k = 0; k < numLines(); k++) {
      for (int n = 0; n < getSyllables(k+1); n++) {
        if (n == getSyllables(k+1) - 1) {
          System.out.print("ta");
          continue;
        }

        System.out.print("ta-");
      }
      System.out.println();
    }
  };
}
