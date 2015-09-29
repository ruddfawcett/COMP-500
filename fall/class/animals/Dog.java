public class Dog extends Animal {
  protected int age;

  public Dog(String name) {
    this.name = name;
    this.noise = "bark";
  }

  protected int dogYears () {
    return age * 7;
  }
}
