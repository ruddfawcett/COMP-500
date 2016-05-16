public abstract class Pet {
  private String name;

  public Pet(String petName) {
    this.name = petName;
  }

  public String getName() {
    return name;
  }

  public abstract String speak();
}
