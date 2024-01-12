package ex4;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exercice2Dialog extends JDialog{
  public Exercice2Dialog(JFrame fenetre) {
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
    panneauHaut.add(new JButton("Bouton1"));
    panneauHaut.add(Box.createHorizontalGlue());
    panneauHaut.add(new JButton("Bouton2"));
    panneauBorder.add(panneauHaut, BorderLayout.NORTH);
    
    JPanel Mid = new JPanel();
    Mid.setLayout(new BoxLayout(Mid, BoxLayout.Y_AXIS));
    
    Mid.add(Box.createVerticalGlue());
    JPanel ensembleHautMid = new JPanel();
    JPanel panneauHautMid = new JPanel();
    panneauHautMid.setLayout(new BoxLayout(panneauHautMid , BoxLayout.Y_AXIS));
    panneauHautMid.add(new JButton("Bouton1"));
    panneauHautMid.add(new JButton("Bouton2"));
    ensembleHautMid.add(panneauHautMid);
    Mid.add(ensembleHautMid);
    
    Mid.add(Box.createVerticalGlue());
    JPanel panneauBasMid = new JPanel();
    panneauBasMid.setLayout(new BoxLayout(panneauBasMid , BoxLayout.X_AXIS));
    panneauBasMid.add(Box.createHorizontalGlue());
    panneauBasMid.add(new JLabel("Ce Texte est statique."));
    Mid.add(panneauBasMid);
    panneauBorder.add(Mid, BorderLayout.CENTER);
    
    JPanel panneauBas = new JPanel();
    panneauBas.setLayout(new BoxLayout(panneauBas, BoxLayout.X_AXIS));
    panneauBas.add(new JButton("Bouton5"));
    panneauBas.add(Box.createHorizontalGlue());
    panneauBas.add(new JButton("Bouton6"));
    panneauBas.add(Box.createHorizontalGlue());
    panneauBas.add(new JButton("Bouton7"));
    panneauBorder.add(panneauBas, BorderLayout.SOUTH);
    
    add(panneauBorder);
  }
}
