import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MaFenetre1 extends JFrame {
  public MaFenetre1() {
    super("Ma Fenêtre 1");
    setSize(600, 300);
    setLocationRelativeTo(null);
    setVisible(true);
    JButton button = new JButton("Rate yourself");
    button.addActionListener(ae -> new Dialogue(this));
    add(button);
  }
}
