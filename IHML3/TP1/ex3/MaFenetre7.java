package ex3;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MaFenetre7 extends JFrame{
  public MaFenetre7() {
    super("Ma Septième Fenêtre.");
    init();
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }
  
  private void init() {
    JPanel panneau = new JPanel();
    panneau.setLayout(new BoxLayout(panneau, BoxLayout.X_AXIS));
    
    panneau.add(new JButton("Bouton " + 1));
    panneau.add(Box.createHorizontalGlue());
    panneau.add(new JButton("Bouton " + 2));
    
    panneau.add(Box.createRigidArea(new Dimension(5,5)));
    
    panneau.add(new JButton("Bouton " + 3));
    panneau.add(Box.createHorizontalGlue());
    panneau.add(Box.createHorizontalGlue());
    panneau.add(new JButton("Bouton " + 4));
    
    panneau.add(Box.createRigidArea(new Dimension(10,20)));
 
    add(panneau);
  }
}