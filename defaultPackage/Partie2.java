package defaultPackage;

import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Partie2 extends JFrame{
  public Partie2(JFrame fenetre) {
    super("Partie2 Exercice3.");
    init();
    pack();
    setLocationRelativeTo(fenetre);
    setVisible(true);
  }
  
  private void init() {
    JPanel page = new JPanel();
    page.setLayout(new BoxLayout(page, BoxLayout.Y_AXIS));
    JPanel panneauHaut = new JPanel();
    panneauHaut.add(new JLabel("Que voulez-vous faire ?"));
    page.add(panneauHaut);
    page.add(Box.createVerticalGlue());
    JPanel buttons = new JPanel(new FlowLayout());
    JButton valider = new JButton("Valider");
    JButton modifier = new JButton("Modifier");
    JButton quitter = new JButton("Quitter");
    buttons.add(valider);
    buttons.add(modifier);
    buttons.add(quitter);
    page.add(buttons);
    add(page);

  }
}
