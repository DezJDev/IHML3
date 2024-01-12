package ex2;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main extends JFrame{
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new MaFenetre2("Ceci est ma deuxième Fenetre"));
    SwingUtilities.invokeLater(() -> new MaFenetre3());
  }
}