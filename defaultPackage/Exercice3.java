package defaultPackage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exercice3 extends JFrame{
  public Exercice3(JFrame fenetre) {
    super("Ma troisième Fenêtre.");
    init();
    pack();
    setLocationRelativeTo(fenetre);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setVisible(true);
  }
  
  private void init() {
    setLayout(new FlowLayout());
    JButton leaveLambda = new JButton("Quitter Lambda");
    leaveLambda.addActionListener(ae -> this.dispose());
    
    JButton leaveAnonymous = new JButton("Quitter Anonymous");
    leaveAnonymous.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();}
    });
    
    class Interne implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent e) {
        dispose();
        }
    }
    
    Interne interne = new Interne();
    JButton leaveInterne = new JButton("Quitter Interne");
    leaveInterne.addActionListener(interne);
    
    
    JButton partie2 = new JButton("Partie2");
    partie2.addActionListener(ae -> new Partie2(this));
    
    add(leaveInterne);
    add(leaveLambda);
    add(partie2);
    add(leaveAnonymous);
  }
}
