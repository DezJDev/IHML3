package defaultPackage;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Exercice1 extends JFrame{
  public Exercice1(JFrame fenetre) {
    super("Ma première Fenêtre.");
    init();
    pack();
    setLocationRelativeTo(fenetre);
    setVisible(true);
  }
  
  private void init() {
    setLayout(new FlowLayout());
    
    JLabel texte = new JLabel("Texte");
    LineBorder bordure1 = new LineBorder(Color.BLACK, 1);
    texte.setBorder(bordure1);

    Border bordure2 = new BevelBorder(BevelBorder.LOWERED);
    JLabel texte2 = new JLabel("Texte");
    texte2.setBorder(bordure2);
    
    Border bordure3 = new LineBorder(Color.RED, 2);
    JLabel texte3 = new JLabel("Texte");
    texte3.setForeground(Color.BLUE);
    texte3.setBorder(bordure3);
    
    JLabel texte4 = new JLabel("Texte");
    JPanel conteneurTexte4 = new JPanel();
    LineBorder bordure4 = new LineBorder(Color.BLACK, 1);
    EmptyBorder emptyBorder = new EmptyBorder(5, 5, 5, 5);
    conteneurTexte4.setBorder(bordure4);
    texte4.setBorder(emptyBorder);
    conteneurTexte4.add(texte4);
    
    JLabel texte5 = new JLabel("Texte");
    JPanel conteneurTexte5 = new JPanel();
    LineBorder bordure5Red = new LineBorder(Color.RED, 1);
    LineBorder bordureBlue = new LineBorder(Color.BLUE, 1);
    texte5.setBorder(bordure5Red);
    conteneurTexte5.setBorder(bordureBlue);
    conteneurTexte5.add(texte5);

    add(texte);
    add(texte2);
    add(texte3);
    add(conteneurTexte4);
    add(conteneurTexte5);
  }
}
