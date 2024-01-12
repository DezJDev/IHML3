package ex3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MaFenetre4 extends JFrame{
  public MaFenetre4() {
    super("Ma Quatrième Fenêtre.");
    init();
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }
  
  private void init() {
    this.setLayout(new BorderLayout());
    add(new JLabel("Mont Saint-Michel"), BorderLayout.NORTH);
    JPanel conteneur = new JPanel(new FlowLayout());
    ImageIcon image = new ImageIcon("src/ex3/ane.png");
    JLabel label = new JLabel(image);
    conteneur.add(label, BorderLayout.CENTER);
    add(conteneur);
  }
}
