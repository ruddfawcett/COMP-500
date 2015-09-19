/**
 * Morning
 * Alternates every five seconds between playing rooster sound
 * (with white background) and moo sound (with black background).
 * Has two alternate solutions (one with boolean, other with even/odd)
 * counter.
 *
 * One problem I did find is that `EasySound` seems to be blocking
 * other functions until `.play()` has finished executing...
 *
 * @author  Rudd Fawcett
 * @course  Period 1 AP CS, Dr. Miles
 * @due     2015-09-20
 */

import javax.swing.JFrame;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Morning extends JFrame implements ActionListener {
  private EasySound rooster;
  private EasySound cow;
  private Container c;

  // private boolean playRooster; Or this way...
  private int count;

  /**
   *   Constructor
   */
  public Morning() {
    super("Morning");
    rooster = new EasySound("sounds/roost.wav");
    cow = new EasySound("sounds/moo.wav");

    Timer clock = new Timer(toMilliseconds(5), this);
    clock.start();

    c = getContentPane();
    c.setBackground(Color.WHITE);

    rooster.play();

    // playRooster = false; Or this way...
    count++;
  }

  public static int toMilliseconds(int seconds) {
    return seconds * 1000;
  }

  public void actionPerformed(ActionEvent e) {
    /** If using a boolean, do the following:

      if (playRooster) {
        rooster.play();
        playRooster = false;
        return;
      }

      cow.play();
      playRooster = true;

    **/

    count++;

    c.setBackground(count % 2 == 0 ? Color.BLACK : Color.WHITE);

    if (count % 2 == 0) {
      cow.play();
      return;
    }

    rooster.play();
  }

  public static void main(String[] args) {
    Morning morning = new Morning();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}
