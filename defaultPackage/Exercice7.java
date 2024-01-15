package defaultPackage;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.ParseException;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.DateFormatter;

public class Exercice7 extends JFrame{
  JFormattedTextField champDate;
  JLabel validite;
  public Exercice7(JFrame fenetre) {
    super("Test champs formatés"); 
    JPanel panneau = new JPanel(); 
    panneau.setLayout(new BorderLayout());
    setContentPane(panneau);
    champDate = new JFormattedTextField(new DateFormatter(DateFormat.getDateInstance(DateFormat.SHORT)));
    champDate.setColumns(12);
    champDate.setFocusLostBehavior(JFormattedTextField.COMMIT);
    panneau.add(champDate,BorderLayout.NORTH);
    JButton test = new JButton(new Validateur()); panneau.add(test, BorderLayout.CENTER);
    validite = new JLabel("A tester"); panneau.add(validite,BorderLayout.SOUTH); 
    pack();
    setLocationRelativeTo(fenetre);
    setVisible(true);
  }
  
  class Validateur extends AbstractAction{
    public Validateur(){ super("test");}
    public void actionPerformed(ActionEvent e) {
    AbstractFormatter formatteur = champDate.getFormatter();
    try {
      Object date = formatteur.stringToValue(champDate.getText()); 
      validite.setText("valide");}
    catch (ParseException pe) {
      validite.setText("invalide");}
    }}
}
