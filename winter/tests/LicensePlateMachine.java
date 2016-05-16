import java.util.ArrayList;

public class LicensePlateMachine {
  private static int plate = 0;
  private static final int PLATE_BASE_NUM = 100000;

  // Optional
  public LicensePlateMachine() {

  }

  public int getPlate() {
    plate++;
    return PLATE_BASE_NUM+plate;
  }

  public static void main(String[] args) {
    // System.out.println("Plate Base Number: " + LicensePlateMachine.PLATE_BASE_NUM);

    LicensePlateMachine machine1 = new LicensePlateMachine();
    LicensePlateMachine machine2 = new LicensePlateMachine();

    for (int k = 0; k < 3; k++) {
      System.out.println(machine1.getPlate());
    }

    for (int k = 0; k < 3; k++) {
      System.out.println(machine2.getPlate());
    }
  }
}
