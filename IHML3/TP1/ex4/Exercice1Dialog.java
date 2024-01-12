package ex4;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercice1Dialog extends JDialog{
  public Exercice1Dialog(JFrame fenetre) {
    super(fenetre, "Boite de Dialogue", true);
    init();
    setLocationRelativeTo(fenetre);
    setSize(500, 300);
    setVisible(true);
  }
  
  private void init() {
    JPanel panneauBorder = new JPanel(new BorderLayout());
    JPanel panneauHaut = new JPanel();
    panneauHaut.setLayout(new BoxLayout(panneauHaut, BoxLayout.X_AXIS));
    panneauHaut.add(Box.createHorizontalGlue());
    for(int i = 0; i < 3; i++) {
      panneauHaut.add(new JButton("Bouton " + (i+1)));
    }
    panneauHaut.add(Box.createHorizontalGlue());
    panneauBorder.add(panneauHaut, BorderLayout.NORTH);
    
    JPanel contentPanneauBas = new JPanel();
    JPanel panneauBas = new JPanel();
    panneauBas.setLayout(new BoxLayout(panneauBas, BoxLayout.Y_AXIS));
    for(int i = 3; i < 5; i++) {
      panneauBas.add(new JButton("Bouton " + (i+1)));
    }
    panneauBorder.add(contentPanneauBas, BorderLayout.SOUTH);
    contentPanneauBas.add(panneauBas);
    add(panneauBorder);
  }
}
