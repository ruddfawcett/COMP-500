package animals;

public class Cat extends Pet {
  public static int lives = 9;

  public Cat(String name) {
    this.name = name;
    this.noise = "meow";
  }

  protected void died() {
    this.lives--;
  }

  public static void main(String[] args) {
    Cat cat = new Cat("Bix");
    cat.makeNoise();
  }
}
