// Class decleration.  Class is named CircleTest
public class CylinderTest {
  // Our standard main method.
  public static void main(String[] args) {
    // Here we are using our Cylinder constructor to create a new Cylinder, with
    // radius 10 and height 10.  We have created a new instance of a Cylinder, using our
    // template, or idea of a Cylinder (in our Cylinder class).
    Cylinder cylinder = new Cylinder(10, 10);

    // Here we are printing out the volume using our `getVolume()` method!
    // If we plug our test values into Google, we get 3141.59...
    // Our calculator is a bit more precise, so we should get 3141.5926535897934! It works!
    System.out.println(cylinder.getVolume());
  }
}
