package defaultPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class Exercice4 extends JFrame {
  ButtonGroup bgroup;
  public Exercice4(JFrame fenetre) {
    super("Ma quatrième Fenêtre.");
    setLayout(new BorderLayout());
    init();
    pack();
    setLocationRelativeTo(fenetre);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setVisible(true);
  }
  private void init() {
    JPanel panneauHaut = new JPanel();
    panneauHaut.setLayout(new BoxLayout(panneauHaut, BoxLayout.X_AXIS));
    JLabel texteGauche = new JLabel("Texte à Gauche");
    JLabel texteDroit = new JLabel("Texte à Droite");
    panneauHaut.add(texteGauche);
    panneauHaut.add(Box.createHorizontalGlue());
    panneauHaut.add(texteDroit);
    add(panneauHaut, BorderLayout.NORTH);
    
    JPanel milieu = creerPanneauMilieu(texteGauche, texteDroit);
    add(milieu, BorderLayout.CENTER);
    
    JPanel panneauBas = creerPanneauBas(texteGauche, texteDroit, bgroup);
    add(panneauBas, BorderLayout.SOUTH);
  }

  private JPanel creerPanneauMilieu(JLabel texteGauche, JLabel texteDroit) {
    JPanel milieu = new JPanel(new FlowLayout());
    JPanel panneauMid = new JPanel();
    panneauMid.setLayout(new BoxLayout(panneauMid, BoxLayout.Y_AXIS));
    bgroup = new ButtonGroup();
    JRadioButton rouge = new JRadioButton("Rouge");
    JRadioButton bleu = new JRadioButton("Bleu");
    JRadioButton vert = new JRadioButton("Vert");
    
    rouge.addActionListener(ae -> changeColor(texteGauche, texteDroit, Color.RED));
    bleu.addActionListener(ae -> changeColor(texteGauche, texteDroit, Color.BLUE));
    vert.addActionListener(ae -> changeColor(texteGauche, texteDroit, Color.GREEN));
    bgroup.add(rouge);
    bgroup.add(bleu);
    bgroup.add(vert);
    
    panneauMid.add(rouge);
    panneauMid.add(bleu);
    panneauMid.add(vert);
    panneauMid.setBorder(new TitledBorder("Colors"));
    milieu.add(panneauMid);
    return milieu;
  }
  
  private JPanel creerPanneauBas(JLabel texteGauche, JLabel texteDroit, ButtonGroup bgroup) {
    JPanel panneauBas = new JPanel();
    panneauBas.setLayout(new BoxLayout(panneauBas, BoxLayout.X_AXIS));
    panneauBas.add(Box.createHorizontalGlue());
    JButton raz = new JButton("Remise à Zéro");
    raz.addActionListener(ae -> raz(bgroup, texteGauche, texteDroit));
    JButton leave = new JButton("Quitter");
    leave.addActionListener(ae -> dispose());
    panneauBas.add(raz);
    panneauBas.add(leave);
    panneauBas.add(Box.createHorizontalGlue());
    return panneauBas;
  }
  
  private void changeColor(JLabel texteGauche, JLabel texteDroit, Color couleur) {
    texteGauche.setForeground(couleur);
    texteDroit.setForeground(couleur);
  }
  private void raz(ButtonGroup bgroup, JLabel texteGauche, JLabel texteDroit) {
    bgroup.clearSelection();
    texteGauche.setForeground(Color.BLACK);
    texteDroit.setForeground(Color.BLACK);
  }
}
