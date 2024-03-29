/**
 * Rudd Fawcett & Alex Emerson
 * A PollDisplayPanel holds the vote counts and
 * displays the numbers and the pie chart for
 * the current vote counts.
 *
 * @author  Maria Litvin
 * @course  Period 1 AP CS, Dr. Miles
 * @due     2015-10-02
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PollDisplayPanel extends JPanel {
  private String name1, name2, name3;
  private int count1, count2, count3;

  public PollDisplayPanel(String nm1, String nm2, String nm3) {
    setBackground(Color.WHITE);

    name1 = nm1;
    name2 = nm2;
    name3 = nm3;
  }

  public void vote1() {
    count1++;
  }

  public void vote2() {
    count2++;
  }

  public void vote3() {
    count3++;
  }

  // Returns a string representation of this object
  public String toString() {
    return name1 + ": " + count1 + " " +
           name2 + ": " + count2 + " " +
           name3 + ": " + count3;
  }

  // Redefines JPanel's paintComponent to draw this pie chart
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int w = getWidth();
    int h = getHeight();
    int x = w/2;
    int y = h/2;
    int r = Math.min(w, h) / 4;

    drawPieChart(g, x, y, r);
    drawLegend(g, x, y, r);
  }

  // Draws the pie chart.
  private void drawPieChart(Graphics g, int x, int y, int r) {
    int total = count1 + count2 + count3;
    int fromDegree = 0;

    if (total > 0) {
      int degrees;

      g.setColor(Color.RED);
      degrees = countToDegrees(count1, total);
      drawSector(g, x, y, r, fromDegree, degrees);

      g.setColor(Color.GREEN);
      fromDegree = degrees;
      degrees =  countToDegrees(count2, total);
      drawSector(g, x, y, r, fromDegree, degrees);

      g.setColor(Color.BLUE);
      fromDegree += degrees;
      degrees = Math.max(360 - fromDegree, 0);
      drawSector(g, x, y, r, fromDegree, degrees);
    }
    else {
      g.setColor(Color.LIGHT_GRAY);
      drawSector(g, x, y, r, fromDegree, 360);
    }
  }

  // Draws the vote counts and the corresponding color squares.
  private void drawLegend(Graphics g, int x, int y, int r) {
    // Display the counts:
    y += (r + 20);
    g.setColor(Color.BLACK);

    g.drawString(name1 + ": " + count1 , x - r, y);
    g.drawString(name2 + ": " + count2 , x, y);
    g.drawString(name3 + ": " + count3 , x + r, y);

    // Display the color squares:
    y += 5;
    x -= 2;

    g.setColor(Color.RED);
    g.fillRect(x - r, y, 10, 10);

    g.setColor(Color.GREEN);
    g.fillRect(x, y, 10, 10);

    g.setColor(Color.BLUE);
    g.fillRect(x + r, y, 10, 10);
  }

  // Returns the number of degrees in a pie slice that
  // corresponds to count / total, rounded to the nearest integer.
  private int countToDegrees(int count, int total) {
    return 360 * count / total;
  }

  // Draws a sector, centered at x, y, of radius r,
  // of angle measure degrees, starting at fromDegree.
  private void drawSector(Graphics g, int x, int y, int r, int fromDegree, int degrees) {
    if (degrees > 359) {
      g.fillOval(x - r, y - r, 2 * r, 2 * r);
    }
    else {
      g.fillArc(x - r, y - r, 2 * r, 2 * r, fromDegree, degrees);
    }
  }
}
