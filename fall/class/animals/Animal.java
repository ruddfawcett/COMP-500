public abstract class Animal {
  protected String noise;

  public void printName() {
    System.out.println(name);
  }

  public void makeNoise() {
    System.out.println(name + " goes " + noise + "!");
  }
}
