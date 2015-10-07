import java.awt.Color;
import java.awt.Graphics;

public class FancyBalloon extends Balloon {
  public FancyBalloon() {
  }

  public FancyBalloon(int x, int y, int r, Color c) {
    super(x, y, r, c);
  }

  public double distance(int x, int y)
  {
    double dx = x - getX();
    double dy = y - getY();
    return Math.min(Math.sqrt(4.0D * dx * dx + dy * dy), Math.sqrt(dx * dx + 4.0D * dy * dy));
  }

  public void draw(Graphics g, boolean makeItFilled) {
    int r = getRadius();
    int x = getX();
    int y = getY();
    Color c = getColor();

    if (makeItFilled) {
      g.setColor(c);
      g.fillRect(x - r, y - r, 2 * r, 2 * r);
      g.setColor(c.brighter());
      g.fillOval(x - r, y - r / 2, 2 * r, r);
    }
    else {
      g.setColor(c);
      g.drawRect(x - r, y - r, 2 * r, 2 * r);
      g.setColor(c.brighter());
      g.drawOval(x - r, y - r / 2, 2 * r, r);
    }
  }
}
