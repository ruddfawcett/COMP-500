// Class declaration.  Class is named Circle.
public class Circle {
  // This is a private field named radius, that is a double (think big decimal) type.
  // radius is accessible anywhere in this class, but NOT subclasses (because it's private)!
  private double radius;

  // This is our Circle constructor... Notice the type is Circle -- hint that it's a Circle constructor!
  public Circle(int r) {
    // Sets the radius of the Circle (the field above) to the formal paramter passed to the constructor.
    // The `this` here is optional. Java can tell if you are referring to a field variable, if there
    // is no variable named `radius` in this scope (or block).  I use `this` to avoid ambiguity, and to
    // let any editors of this file know that I am referring to the field variable.
    this.radius = r;
  }

  // This is our `getArea()` method!  This returns the area of a circle (2πr²).
  // Notice how the type of the method is not `void` or `Circle`, so we know that the method
  // evaluates to something, and is NOT a constructor or a method that just does something.
  // The type is double, so we know that this method returns a double.
  public double getArea() {
    // Here we multilpy π x the radius squared. Math.PI is a CONSTANT, and we can use
    // Math is accessible by default, so we DON'T need to import anything.
    // We are simply multiplying this.radius x this.radius (squaring it), and then multiplying
    // it by pi! Since pi (~3.14159265...) is a decimal, we need to return a double!
    return Math.PI * (this.radius * this.radius);
  }
}
