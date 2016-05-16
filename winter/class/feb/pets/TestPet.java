import java.util.List;
import java.util.ArrayList;

public class TestPet {
  public static void main(String[] args) {
    List<Pet> pets = new ArrayList<Pet>();
    pets.add(new Cat("Bix"));
    pets.add(new Dog("Bruce"));
    pets.add(new Cat("Xavier"));
    pets.add(new LoudDog("Rufus"));
    pets.add(new Dog("Fern"));

    Kennel kennel = new Kennel(pets);

    kennel.allSpeak();
  }
}
