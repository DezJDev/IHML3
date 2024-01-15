package defaultPackage;

import javax.swing.SwingUtilities;

public class Main {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Menu::new);
  }

}
