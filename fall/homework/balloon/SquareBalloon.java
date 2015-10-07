import java.awt.Color;
import java.awt.Graphics;

public class SquareBalloon extends Balloon
{
  public SquareBalloon()
  {
  }

  public SquareBalloon(int x, int y, int r, Color c)
  {
    super(x, y, r, c);
  }

  public double distance(int x, int y)
  {
    double dx = Math.abs(x - getX());
    double dy = Math.abs(y - getY());
    return Math.max(dx, dy);
  }

  public void draw(Graphics g, boolean makeItFilled)
  {
    g.setColor(getColor());
    int r = getRadius();
    int x = getX();
    int y = getY();

    if (makeItFilled) {
      g.fillRect(x - r, y - r, 2 * r, 2 * r);
    }
    else {
      g.drawRect(x - r, y - r, 2 * r, 2 * r);
    }
  }
}
