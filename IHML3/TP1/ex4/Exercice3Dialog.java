package ex4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercice3Dialog extends JDialog{
    public Exercice3Dialog(JFrame fenetre) {
      super(fenetre, "Boite de Dialogue", true);
      init();
      setLocationRelativeTo(fenetre);
      setSize(500, 300);
      setVisible(true);
    }
    
    private void init() {
      JPanel ensemble = new JPanel();
      ensemble.setLayout(new BoxLayout(ensemble, BoxLayout.Y_AXIS));
      
      JPanel ligneHaute = new JPanel();
      ligneHaute.setLayout(new BoxLayout(ligneHaute, BoxLayout.X_AXIS));
      
      JPanel ligneBasse = new JPanel();
      ligneBasse.setLayout(new BoxLayout(ligneBasse, BoxLayout.X_AXIS));
      
      JPanel panneauHautG = new JPanel();
      JButton bouton1 = new JButton("Haut Gauche");
      panneauHautG.add(bouton1);
      ligneHaute.add(panneauHautG);
      
      JPanel panneauHautD = new JPanel();
      JButton bouton2 = new JButton("Haut Droit");
      panneauHautD.add(bouton2);
      ligneHaute.add(panneauHautD);
      
      JPanel panneauBasG = new JPanel();
      JButton bouton3 = new JButton("Bas Gauche");
      panneauBasG.add(bouton3);
      ligneBasse.add(panneauBasG);
      
      JPanel panneauBasD = new JPanel();
      JButton bouton4 = new JButton("Bas Droit");
      panneauBasD.add(bouton4);
      ligneBasse.add(panneauBasD);
      
      ensemble.add(ligneHaute);
      ensemble.add(ligneBasse);
      add(ensemble);
    }
  }