import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Fenetre extends JFrame {
  public Fenetre() {
    super("Interface création de signal");
    this.setLayout(new BorderLayout());
    init();
    pack();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    setLocationRelativeTo(null);
	    setResizable(false);
    setVisible(true);
  }
  private void init() {
    JPanel buttons = new JPanel(new FlowLayout());
    // Ajout d'une liste déroulante des codes.
    String[] codes = {"NRZ", "NRZI", "Manchester", "Manchester Diff", "Miller" };
    JComboBox code = new JComboBox(codes);
    code.setSelectedIndex(0);
    buttons.add(code);
    
    // Ajout d'une zone de texte pour la chaine binaire.
    JLabel label1 = new JLabel("Code Binaire");
    buttons.add(label1);
    JTextField textArea = new JTextField("");
    textArea.setPreferredSize(new Dimension(200, 20));
    buttons.add(textArea);
    add(buttons, BorderLayout.NORTH);
    
    JPanel cadre = new JPanel(new BorderLayout());
    Dessin drawing = new Dessin(textArea.getText(), code.getSelectedIndex());
    
    JScrollPane scrollPane = new JScrollPane(drawing);
    scrollPane.setPreferredSize(new Dimension(450, 200));
    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
 
    JButton generate = new JButton("Generate");
    JPanel messageErrorCentre = new JPanel();
    messageErrorCentre.add(Box.createHorizontalGlue());
    JLabel errorMsg = new JLabel("Veuillez entrer une chaine valide.");  
    errorMsg.setForeground(new Color(255, 0, 0));
    errorMsg.setVisible(false);
    messageErrorCentre.add(errorMsg);
    messageErrorCentre.add(Box.createHorizontalGlue());
    generate.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	if(!checkText(textArea.getText())) {
    		errorMsg.setVisible(true);
    	} else {
    		errorMsg.setVisible(false);
	        drawing.maj(textArea.getText(), code.getSelectedIndex());
	        drawing.setSize(drawing.getPreferredSize());
	        drawing.repaint();}
      }});
    cadre.add(scrollPane, BorderLayout.CENTER);
    cadre.add(messageErrorCentre, BorderLayout.SOUTH);
    add(cadre, BorderLayout.CENTER);
    add(generate, BorderLayout.SOUTH);
    getRootPane().setDefaultButton(generate);
  }
  
  private boolean checkText(String chaine) {
	  for(int i = 0; i < chaine.length(); i++) {
		  if(!(chaine.charAt(i) == '0' || chaine.charAt(i) == '1')) {
			  return false;
		  }
	  }
	  return true;
  }
}