// Class decleration.  Class is named Cylinder.
public class Cylinder {
  // This is a private field named base, which is a Circle type.  See Circle.java for
  // subclass explanations regarding `private`.  We will need to set this to a
  // new Circle() (using the constructor)!
  private Circle base;
  // This is a private field named height, which is a int type.
  private int height;

  // This is a Cylinder constructor!  It takes a radius, and height, which we will use to
  // set our height and create a new base Circle.
  public Cylinder(int r, int h) {
    // Here we set the base to a new Circle instance.  We are passing `r` to our Circle
    // constructor -- AKA taking the value of `r`, and using it to create a new Circle with
    // radius `r`.
    this.base = new Circle(r);
    // We set our Cylinder height here, like we have done in other classes before.
    this.height = h;
  }

  // Like in Circle, we need to make a method that evalues to something and returns it.
  // We use the cylinder volume formula of area of base x height to find our volume.
  // here we can use the `getArea()` method on our base circle (the field variable above)!
  public double getVolume() {
    // Here we are simply multilpying the height of this Cylinder by the area of our base Circle.
    // We need to return this as a double, because we are multiplying by pi at somepoint,
    // and we will get inaccurate results (the decimal will be cut off, think 3.5 --> 3),
    // so if we want to be precise, and keep the decimals, we need to evaluate to a double.
    return this.height * this.base.getArea();
  }
}
