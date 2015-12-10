/**
 * FortuneTeller
 * Tells a user a random fortune.
 *
 * @author  Rudd Fawcett
 * @course  Period 6 AP CS, Ms. Litvin
 * @due     2015-12-07
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FortuneTeller extends JFrame implements ActionListener {
  private JTextField display;

  private static final EasySound ding = new EasySound("ding.wav");

  private static String[] fortunes = {"Happiness will find you soon.", "I see great loss in the near future.", "You will do well on your next big task.", "I see a bright future in your midst.", "Continue trying, what you desire is closer than you think."};

  /**
   * Constructs a new FortuneTeller.
   * @return The FortuneTeller.
   */
  public FortuneTeller() {
    super("Fortune Teller");

    display = new JTextField("  Press \"Next\" to see your fortune...", 25);
    display.setBackground(Color.WHITE);
    display.setEditable(false);

    JButton go = new JButton("Next");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(display);
    c.add(go);
  }

  /**
   * Invoked when an action occurs.
   * @param e The action event.
   */
  public void actionPerformed(ActionEvent e) {
    int fortuneIndex = (int)(Math.random() * fortunes.length);

    display.setText("  " + fortunes[fortuneIndex]);
    ding.play();
  }

  public static void main(String[] args) {
    JFrame window = new FortuneTeller();
    window.setBounds(300, 300, 400, 100);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setVisible(true);
  }
}
