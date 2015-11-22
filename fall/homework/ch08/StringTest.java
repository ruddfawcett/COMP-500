import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;

public class StringTest extends JFrame
        implements ActionListener
{
  private JTextField input, result;
  private int counter;

  public StringTest()
  {
    super("String test");
    Box box1 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Input:"));
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Result:"));

    input = new JTextField(20);
    input.setBackground(Color.YELLOW);
    input.addActionListener(this);
    input.selectAll();

    result = new JTextField(20);
    result.setBackground(Color.WHITE);
    result.setEditable(false);

    Box box2 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box2.add(input);
    box2.add(Box.createVerticalStrut(20));
    box2.add(result);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(box1);
    c.add(box2);
    input.requestFocus();
  }

  public void run() {
    System.out.println("Try to figure out what Cooney likes:\n");
    System.out.println("Cooney likes MOON but he doesn't like SUN");
    System.out.println("Cooney likes SOCCER but he doesn't like HOCKEY");
    System.out.println("Cooney likes SUMMER but he doesn't like SPRING\n");
    System.out.println("Does Cooney like ... (enter one word below)");

    this.counter = 0;
  }

  public void actionPerformed(ActionEvent e) {
    String str = input.getText();

    String formatted = formattedRule(str);

    input.setText(formatted);
    input.selectAll();
  }

  public String formattedRule(String input) {
    if (obeysRule(input)) {
      return "Yes, Cooney likes " + input.toUpperCase();
    }
    else {
      return "No, Cooney doesn't like " + input.toUpperCase();
    }
  }

  public boolean obeysRule(String word) {


    for (int i = 0; i < word.length(); i++) {
      if (!Character.isLetterOrDigit(word.charAt(i))) {
        return false;
      }

      reverse = word.charAt(i) + reverse;
    }

    return word.toUpperCase().equals(reverse.toUpperCase());
  }

  public static void main(String[] args) {
    StringTest window = new StringTest();
    window.setBounds(100, 100, 360, 160);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}
