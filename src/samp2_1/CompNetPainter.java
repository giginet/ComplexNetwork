/**
 * CompNetPainter.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/18
 * 
 */
package samp2_1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * @author giginet
 * 
 */
public class CompNetPainter extends JPanel{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  ArrayList<Node> nodes = null;
  Network network = null;
  BufferedImage image = null;
  Graphics imageGraphics = null;
  static final int nodeNum = 50;
  static final double radius = 300.0;
  private int w;
  private int h;
  private int centerX;
  private int centerY;

  public CompNetPainter(){
    nodes = new ArrayList<Node>();
    network = new Network(nodeNum);
  }

  public void paintComponent(Graphics g){
    if(image == null){
      Dimension d = this.getSize();
      w = d.width;
      h = d.height;

      image = (BufferedImage) createImage(w, h);
      imageGraphics = image.createGraphics();

      imageGraphics.setColor(Color.white);
      imageGraphics.fillRect(0, 0, w, h);

      centerX = d.width / 2;
      centerY = d.height / 2;

      double arc = 2.0 * Math.PI / (double) nodeNum;

      for(int i = 0; i < nodeNum; ++i){
        double nArc = arc * (double) i;
        int x = (int) (radius * Math.cos(nArc)) + centerX;
        int y = (int) (radius * Math.sin(nArc)) + centerY;
        nodes.add(new Node(x, y));
      }

      for(int i = 0; i < nodeNum; ++i){
        for(int j = i + 1; j < nodeNum; ++j){
          network.setLink(nodes.get(i), nodes.get(j));
        }
      }
    }
    super.paintComponent(g);
    
    imageGraphics.setColor(Color.blue);
    for(int i=0;i<nodeNum;++i){
      for(int j=i+1;j<nodeNum;++j){
        Node n1 = nodes.get(i);
        Node n2 = nodes.get(j);
        if(network.isLink(n1, n2)){
          imageGraphics.drawLine(n1.getX(), n1.getY(), n2.getX(), n2.getY());
        }
      }
    }
    imageGraphics.setColor(Color.red);
    for(int i=0;i<nodeNum;++i){
      Node node = nodes.get(i);
      imageGraphics.fillOval(node.getX()-5, node.getY()-5, 10, 10);
    }
    g.drawImage(image, 0, 0, this);
    
  }
}
