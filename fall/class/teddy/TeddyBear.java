public class TeddyBear {
  private String name;
  private String[] adjectives;

  private int age;
  private int hugs;
  private static int totalHugs = 0;

  // private Face face;
  // private Shirt shirt;
  // private Pants pants;

  public TeddyBear(String name, int age, String[] adjectives) {
    this.name = name;
    this.age = age;
    this.adjectives = adjectives;

    System.out.println("Hi!  I'm a new bear named " + name + ", just for you!");
  }

  public TeddyBear() {
    this("Teddy", 16, new String[]{"cute", "lovable", "satan"});
  }

  public void hug(TeddyBear other) {
    totalHugs++;
    addHug();
    other.addHug();
  }

  protected void addHug() {
    hugs++;
  }

  protected static int getTotalHugs() {
    return totalHugs;
  }

  public String toString() {
    return "TeddyBear: hugs=" + totalHugs;
  }

  public static void main(String[] args) {
    TeddyBear ted = new TeddyBear();
    System.out.println(ted);
  }
}
