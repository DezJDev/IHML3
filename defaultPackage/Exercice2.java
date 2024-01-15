package defaultPackage;

import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exercice2 extends JFrame {
  public Exercice2(JFrame fenetre) {
    super("Ma deuxième Fenêtre.");
    init();
    pack();
    setLocationRelativeTo(fenetre);
    setVisible(true);
  }
  
  private void init() {
    setLayout(new FlowLayout());
    JPanel conteneur = new JPanel();
    JLabel texte1 = new JLabel("Texte1");
    JLabel texte2 = new JLabel("Texte2");
    JLabel texte3 = new JLabel("Texte3");
    
    texte1.setToolTipText("Aide Bulle");
    texte2.setToolTipText("Aide Bulle");
    texte3.setToolTipText("Aide Bulle");
    conteneur.add(texte1);
    conteneur.add(texte2);
    conteneur.add(texte3);
    
    add(Box.createHorizontalGlue());
    add(Box.createVerticalGlue());
    add(conteneur);
    add(Box.createHorizontalGlue());
    add(Box.createVerticalGlue());
  }
}
