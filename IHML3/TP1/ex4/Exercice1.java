package ex4;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exercice1 extends JFrame{
  public Exercice1() {
    super("Ma Huitième Fenêtre.");
    
    this.setLayout(new FlowLayout());;
    JButton bouton = new JButton("Exercice 1");
    bouton.addActionListener(ae -> new Exercice1Dialog(this));
    add(bouton);
    
    JButton bouton2 = new JButton("Exercice 2");
    bouton2.addActionListener(ae -> new Exercice2Dialog(this));
    add(bouton2);
    
    JButton bouton3 = new JButton("Exercice 3");
    bouton3.addActionListener(ae -> new Exercice3Dialog(this));
    add(bouton3);
    
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }
}
