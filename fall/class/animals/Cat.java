public class Cat extends Animal {
  public static int lives = 9;

  public Cat(String name) {
    this.name = name;
    this.noise = "meow";
  }
  protected void died() {
    this.lives--;
  }
}
