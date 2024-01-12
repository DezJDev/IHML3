package ex2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MaFenetre3 extends JFrame{
  public MaFenetre3() {
    super("Ma Troisième Fenêtre");
    JPanel panneau = new JPanel();
    panneau.add(new JLabel("Ceci est le texte de ma troisième Fenêtre."));
    add(panneau);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }
}
