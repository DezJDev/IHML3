package defaultPackage;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exercice6 extends JFrame{
  public Exercice6(JFrame fenetre) {
    super("Ma sixième Fenêtre.");
    init();
    pack();
    setLocationRelativeTo(fenetre);
    setVisible(true);
  }
  
  private void init() {
    JPanel page = new JPanel(new BorderLayout());
    creerPanneauHaut(page);
    creerPanneauMid(page);
    creerPanneauBas(page);
    add(page);
  }
  
  private void creerPanneauHaut(JPanel page) {
    JPanel panneauHaut = new JPanel();
    panneauHaut.add(Box.createHorizontalGlue());
    panneauHaut.add(new JLabel("Bonjour"));
    panneauHaut.add(Box.createHorizontalGlue());
    page.add(panneauHaut, BorderLayout.NORTH);
  }
  
  private void creerPanneauMid(JPanel page) {
     JPanel panneauMid = new JPanel();
     panneauMid.setBorder(BorderFactory.createTitledBorder("Authentification"));
     panneauMid.setLayout(new BoxLayout(panneauMid, BoxLayout.Y_AXIS));
     
     JPanel logging = new JPanel();
     JLabel loger = new JLabel("Nom d'utilisateur: ");
     JTextField login = new JTextField(20);
     logging.add(loger);
     logging.add(login);
     panneauMid.add(logging);
     
     JPanel mot = new JPanel();
     JLabel motDePasse = new JLabel("Mot de passe: ");
     JPasswordField mdp = new JPasswordField(20);
     mot.add(motDePasse);
     mot.add(mdp);
     panneauMid.add(mot);
     
     JPanel texte = new JPanel();
     JLabel anecdote = new JLabel("Anecdote: ");
     JTextArea anec = new JTextArea(30, 30);
     anec.setWrapStyleWord(true);
     anec.setLineWrap(true);
     texte.add(anecdote);
     texte.add(anec);
     panneauMid.add(texte);
     
     page.add(panneauMid, BorderLayout.CENTER);
  }
  
  private void creerPanneauBas(JPanel page) {
    JPanel panneauBas = new JPanel();
    JPanel contQuestion = new JPanel();
    JButton question = new JButton("Question");
    contQuestion.add(question);
    contQuestion.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
    
    JPanel contQuitter = new JPanel();
    JButton quitter = new JButton("Quitter");
    quitter.addActionListener(ae -> dispose());
    contQuitter.add(quitter);
    panneauBas.add(Box.createHorizontalGlue());
    panneauBas.add(contQuestion);
    panneauBas.add(quitter);
    panneauBas.add(Box.createHorizontalGlue());
    page.add(panneauBas, BorderLayout.SOUTH);
  }
}
