package ex2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MaFenetre2 extends JFrame{
  private static String textStatic;
   public MaFenetre2(String text) {
     super("Ma Deuxième Fenêtre");
     textStatic = text;
     add(new JLabel(text));
     pack();
     setLocationRelativeTo(null);
     setVisible(true);
   }
}
