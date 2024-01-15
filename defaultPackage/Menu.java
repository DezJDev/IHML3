package defaultPackage;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends JFrame{
  public Menu() {
    super("Fenêtre du Menu.");
    init();
    pack();
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  private void init() {
    setLayout(new FlowLayout());
    
    JButton exercice1 = new JButton("Exercice 1");
    exercice1.addActionListener(ae -> new Exercice1(this));
    
    JButton exercice2 = new JButton("Exercice 2");
    exercice2.addActionListener(ae -> new Exercice2(this));
    
    JButton exercice3 = new JButton("Exercice 3");
    exercice3.addActionListener(ae -> new Exercice3(this));
    
    JButton exercice4 = new JButton("Exercice 4");
    exercice4.addActionListener(ae -> new Exercice4(this));
    
    JButton exercice5 = new JButton("Exercice 5");
    exercice5.addActionListener(ae -> new Exercice5(this));
    
    JButton exercice6 = new JButton("Exercice 6");
    exercice6.addActionListener(ae -> new Exercice6(this));
    
    JButton exercice7 = new JButton("Exercice 7");
    exercice7.addActionListener(ae -> new Exercice7(this));
    
    
    add(exercice1);
    add(exercice2);
    add(exercice3);
    add(exercice4);
    add(exercice5);
    add(exercice6);
    add(exercice7);
  }
}
