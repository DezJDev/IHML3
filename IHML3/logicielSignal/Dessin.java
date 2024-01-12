import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Dessin extends JPanel{
  private String chaine;
  private int code = 0;
  public Dessin(String chaine, int code) {
    super();
    this.chaine = chaine;
    this.code = code;
  }
  
  public void maj(String chaine, int code) {
    this.chaine = chaine;
    this.code = code;
    
  }
  
  @Override
  public void paint(Graphics graph){
    super.paint(graph);
    graph.setColor(new Color(0,0,0));
    graph.setFont(new Font("default", Font.BOLD, 16));
    graph.drawString("nV", 0, 50);
    graph.drawString("0V", 0, 100);
    graph.drawString("-nV", 0, 150);
    switch(code) {
    case 0:
     NRZ(graph);
     break;
    case 1:
      NRZI(graph);
      break;
    case 2:
      Manchester(graph);
      break;
    case 3:
      ManchesterDiff(graph);
      break;
    case 4:
      Miller(graph);
      break;
    }
    pointilles(graph);
  }
  
  @Override
  public Dimension getPreferredSize() {
      return new Dimension(chaine.length() * 50, 400);
  }
  
  public void NRZ(Graphics graph) {
    int y = 50;
    int x = 0;
    //NRZ signalNRZ = new NRZ();
    //graph = signalNRZ.createSignal(chaine, graph);
    for(int i = 0; i < chaine.length(); i++) {
      if(chaine.charAt(i) == '1') {
        graph.drawString("1", x+25, 25);
        if(y == 50) {
          x = traitHorizontal(graph, x, y);
        } else {
          y = traitVertical(graph, x, y);
          x = traitHorizontal(graph, x, y);
        }

      } 
      else {
        graph.drawString("0", x+25, 25);
        if(y == 50) {
          y = traitVertical(graph, x, y);
          x = traitHorizontal(graph, x, y);
        } else {
          x = traitHorizontal(graph, x, y);
        }
      }
    }
  }
  
  public void NRZI(Graphics graph) {
    int y = 50;
    int x = 0;
    //NRZ signalNRZ = new NRZ();
    //graph = signalNRZ.createSignal(chaine, graph);
    for(int i = 0; i < chaine.length(); i++) {
      if(chaine.charAt(i) == '1') {
        graph.drawString("1", x+25, 25);
        if(y == 50) {
          y = traitVertical(graph, x, y);
          x = traitHorizontal(graph, x, y);
          
        } else {
          x = traitHorizontal(graph, x, y);
        }

      } 
      else {
        graph.drawString("0", x+25, 25);
        if(y == 50) {
          x = traitHorizontal(graph, x, y);
        } else {
          y = traitVertical(graph, x, y);
          x = traitHorizontal(graph, x, y);
        }
      }
    }
  }

  public void Manchester(Graphics graph) {
    int y = 50;
    int x = 0;
    //NRZ signalNRZ = new NRZ();
    //graph = signalNRZ.createSignal(chaine, graph);
    for(int i = 0; i < chaine.length(); i++) {
      if(chaine.charAt(i) == '1') {
        graph.drawString("1", x+25, 25);
        if(y == 50) {
          x = demiHorizontal(graph, x, y);
          y = traitVertical(graph, x, y);
          x = demiHorizontal(graph, x, y);
        } else {
          y = traitVertical(graph, x, y);
          x = demiHorizontal(graph, x, y);
          y = traitVertical(graph, x, y);
          x = demiHorizontal(graph, x, y);
        }

      } 
      else {
    	graph.drawString("0", x+25, 25);
        if(y == 50) {
          y = traitVertical(graph, x, y);
          x = demiHorizontal(graph, x, y);
          y = traitVertical(graph, x, y);
          x = demiHorizontal(graph, x, y);
        } else {
          x = demiHorizontal(graph, x, y);
          y = traitVertical(graph, x, y);
          x = demiHorizontal(graph, x, y);
        }
      }
    }
  }

  public void ManchesterDiff(Graphics graph) {
    int y = 50;
    int x = 0;
    //NRZ signalNRZ = new NRZ();
    //graph = signalNRZ.createSignal(chaine, graph);
    for(int i = 0; i < chaine.length(); i++) {
      if(chaine.charAt(i) == '1') {
        graph.drawString("1", x+25, 25);
        if(y == 50) {
          x = demiHorizontal(graph, x, y);
          y = traitVertical(graph, x, y);
          x = demiHorizontal(graph, x, y);
        } else {
          x = demiHorizontal(graph, x, y);
          y = traitVertical(graph, x, y);
          x = demiHorizontal(graph, x, y);
        }

      } 
      else {
        graph.drawString("0", x+25, 25);
        if(y == 50) {
          y = traitVertical(graph, x, y);
          x = demiHorizontal(graph, x, y);
          y = traitVertical(graph, x, y);
          x = demiHorizontal(graph, x, y);
        } else {
          y = traitVertical(graph, x, y);
          x = demiHorizontal(graph, x, y);
          y = traitVertical(graph, x, y);
          x = demiHorizontal(graph, x, y);
        }
      }
    }
  }

  public void Miller(Graphics graph) {
    graph.setColor(new Color(0,0,0));
    int y = 150;
    int x = 0;
    //NRZ signalNRZ = new NRZ();
    //graph = signalNRZ.createSignal(chaine, graph);
    for(int i = 0; i < chaine.length(); i++) {
      if(chaine.charAt(i) == '1') {
        graph.drawString("1", x+25, 25);
        if(y == 50) {
          x = demiHorizontal(graph, x, y);
          y = traitVertical(graph, x, y);
          x = demiHorizontal(graph, x, y);
        } else {
          x = demiHorizontal(graph, x, y);
          y = traitVertical(graph, x, y);
          x = demiHorizontal(graph, x, y);
        }

      } 
      else {
        graph.drawString("0", x+25, 25);
        int nextIndex = getNextIndex(i);
        x = traitHorizontal(graph, x, y);
        if(nextIndex == '0') {
          if(y == 50) {
            y = traitVertical(graph, x, y);
          } else {
            y = traitVertical(graph, x, y);
          }
        }
      }
    }
  }
  
  public char getNextIndex(int i) {
    if (i < chaine.length() - 1) {
      return chaine.charAt(i+1);
    }
    else {
      return 'x';
    }
      
  }

  public void pointilles(Graphics graph) {
    graph.setColor(new Color(0, 0, 0));
    for(int colonne = 50; colonne <= chaine.length() * 50; colonne+= 50) {
      for(int nbpoint = 0; nbpoint < 400-1; nbpoint += 5) {
        graph.drawLine(colonne, nbpoint, colonne, nbpoint+5);
        nbpoint += 5;
      }
    }
    for(int ligne = 1; ligne < 4; ligne++) {
      for(int nbpoint = 0; nbpoint < chaine.length() * 50; nbpoint += 5) {
        graph.drawLine(nbpoint, ligne * 50, nbpoint+5, ligne * 50);
        nbpoint += 5;
      }
    
    }
  }
  
  private int traitVertical(Graphics graph, int x, int y) {
    if(y == 50) {
      graph.drawLine(x-1, y, x-1, y+100);
      graph.drawLine(x, y, x, y+100);
      y+=100;
    } 
    else {
      graph.drawLine(x-1, y, x-1, y-100);
      graph.drawLine(x, y, x, y-100);
      y-=100;
    }
    return y;
  }
  
  private int demiHorizontal(Graphics graph, int x, int y) {
      graph.drawLine(x, y-1, x+25, y-1);
      graph.drawLine(x, y, x+25, y);
      graph.drawLine(x, y+1, x+25, y+1);
      x+=25;
      return x;
  }
  
  private int traitHorizontal(Graphics graph, int x, int y) {
    graph.drawLine(x, y-1, x+50, y-1);
    graph.drawLine(x, y, x+50, y);
    graph.drawLine(x, y+1, x+50, y+1);
    x+=50;
    return x;
  }
}
