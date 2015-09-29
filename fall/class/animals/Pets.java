public class Pets {
  public static void main(String[] args) {
    Dog d = new Dog("Sparky");
    d.age = 16;
    d.makeNoise();

    System.out.println(d.name + "is " + d.dogYears() + " in dog years!");

    Cat c = new Cat("Bix");
    c.makeNoise();

    System.out.println(c.name + " has " + c.LIVES + " lives!");
  }
}
