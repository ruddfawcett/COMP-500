public class LoudDog extends Dog {
  public LoudDog(String petName) {
    super(petName);
  }

  public String speak() {
    return super.speak() + " " + super.speak();
  }
}
