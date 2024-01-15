package defaultPackage;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class Exercice5 extends JFrame{
  public Exercice5(JFrame fenetre) {
    super("Ma cinquième Fenêtre.");
    init();
    pack();
    setLocationRelativeTo(fenetre);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setVisible(true);
  }
  
  private void init() {
    JPanel page = new JPanel();
    page.setLayout(new BoxLayout(page, BoxLayout.Y_AXIS));
    creerPanneauHaut(page);
    creerPanneauMid(page);
    creerPanneauBas(page);
    add(page);
  }

  private void creerPanneauHaut(JPanel page) {
    JPanel panneauHaut = new JPanel();
    panneauHaut.setLayout(new BoxLayout(panneauHaut, BoxLayout.X_AXIS));
    JCheckBox gaucher = new JCheckBox("Gaucher");
    JCheckBox droitier = new JCheckBox("Droitier");
    panneauHaut.add(Box.createHorizontalGlue());
    panneauHaut.add(gaucher);
    panneauHaut.add(Box.createHorizontalGlue());
    panneauHaut.add(droitier);
    panneauHaut.add(Box.createHorizontalGlue());
    page.add(panneauHaut);
  }

  private void creerPanneauMid(JPanel page) {
    JPanel milieu = new JPanel();
    JPanel panneauMid = new JPanel();
    panneauMid.setLayout(new BoxLayout(panneauMid, BoxLayout.Y_AXIS));
    String[] ecoles ={"École maternelle","École élémentaire","Collège","Lycée","Enseignement Supérieur"};    
    JComboBox combo = new JComboBox(ecoles);
    combo.setSelectedIndex(0);
    panneauMid.add(combo);
    
    String[] matieres ={"Mathématiques", "Français", "Anglais", "Physique-Chimie", "SVT", "EPS"};    
    JList liste = new JList(matieres);
    liste.setSelectedIndex(0);
    panneauMid.add(liste);
    milieu.add(panneauMid);
    page.add(milieu);
  }

  private void creerPanneauBas(JPanel page) {
    JPanel panneauBas = new JPanel();
    panneauBas.setLayout(new BoxLayout(panneauBas, BoxLayout.X_AXIS));
    JButton annuler = new JButton("Annuler");
    JButton quitter = new JButton("Quitter");
    quitter.addActionListener(ae -> dispose());

    panneauBas.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
    panneauBas.add(quitter);
    panneauBas.add(Box.createHorizontalGlue());
    panneauBas.add(annuler);
    page.add(panneauBas);
  }
}
