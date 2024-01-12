package ex3;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MaFenetre5 extends JFrame {
  public MaFenetre5() {
    super("Ma Cinquième Fenêtre");
    this.setLayout(new FlowLayout());
    init();
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }
  
  private void init() {
    for(int i = 0; i < 5; i++) {
      add(new JButton("Bouton " + (i+1)));
    }
  }
}
