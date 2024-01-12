package ex3;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MaFenetre6 extends JFrame{
  public MaFenetre6() {
    super("Ma Sixième Fenêtre.");
    init();
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }
  
  private void init() {
    JPanel panneau = new JPanel();
    panneau.setLayout(new BoxLayout(panneau, BoxLayout.X_AXIS));
    
    /*1.
    panneau.add(Box.createHorizontalGlue());
    for(int i = 0; i < 3; i++) {
      panneau.add(new JButton("Bouton " + (i+1)));
    }
    panneau.add(Box.createHorizontalGlue());*/
    
    /*2.
    panneau.add(Box.createHorizontalGlue());
    for(int i = 0; i < 3; i++) {
      if(i > 1) {
        panneau.add(Box.createRigidArea(new Dimension(5,5)));
      }
      panneau.add(new JButton("Bouton " + (i+1)));
    }
    panneau.add(Box.createHorizontalGlue());*/
    
    for(int i = 0; i < 2; i++) {
      panneau.add(new JButton("Bouton " + (i+1)));
    }
    panneau.add(Box.createHorizontalGlue());
    panneau.add(new JButton("Bouton " + 3));
    
    add(panneau);
  }
}
