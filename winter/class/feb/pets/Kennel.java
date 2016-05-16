import java.util.List;

public class Kennel {
  private List<Pet> petList;

  public Kennel(List<Pet> petList) {
    this.petList = petList;
  }

  public void allSpeak() {
    for (Pet pet: petList) {
      System.out.println(pet.getName() + " " + pet.speak());
    }
  }
}
