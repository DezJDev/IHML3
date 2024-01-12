import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dialogue extends JDialog{
  public Dialogue(JFrame fenetre) {
    super(fenetre, "Question principale", true);
    this.setLayout(new FlowLayout());
    JPanel q = new JPanel(new FlowLayout());
    q.add(new JLabel("Question numéro 1"));
    add(q);
    
    JPanel buttons = new JPanel(new FlowLayout());
    buttons.add(new JButton("Choix 1"));
    buttons.add(new JButton("Choix 2"));
    add(buttons);
    
    setSize(300, 100);
    setLocationRelativeTo(fenetre);
    setVisible(true);
  }
}
