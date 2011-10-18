/**
 * Painter2_1_1.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/17
 * 
 */
package exp1_1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import java.util.Random;

/**
 * @author giginet
 *
 */
public class Painter2_1_1 extends JPanel{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private BufferedImage image = null;
  private Graphics2D imageGraphics;
  private int width;
  private int height;
  
  public void paintComponent(Graphics g){
    /**
     * JPanelのpaintComponentをオーバーライドして、絵を描画できるようにする
     * @param g Graphics
     */
    // Graphicsでは一部利用できないメソッドなどがあるため、上位互換であるGraphics2Dにキャストする
    Graphics2D g2 = (Graphics2D)g;
    if(image == null){
      Dimension d = getSize();
      width = d.width;
      height = d.height;
      image = (BufferedImage)createImage(width, height);
      
      imageGraphics = image.createGraphics();
      imageGraphics.setColor(Color.white);
      imageGraphics.fillRect(0, 0, width, height);
    }
    
    super.paintComponent(g);
    imageGraphics.setColor(Color.black);
    Random rand = new Random();
    Shape shape = Shape.values()[rand.nextInt(Shape.values().length)];
    Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    imageGraphics.setColor(color);
    if(shape == Shape.Line){
      imageGraphics.draw(new Line2D.Float(rand.nextInt(width), rand.nextInt(height), rand.nextInt(width), rand.nextInt(height)));
    }else{
      double rootx = rand.nextInt(width);
      double rooty = rand.nextInt(height);
      int w = rand.nextInt(width-(int)rootx);
      int h = rand.nextInt(height-(int)rooty);
      if(shape == Shape.Circle || shape == Shape.FillCircle){
        Ellipse2D s = new Ellipse2D.Double(rootx, rooty, w, h);
        imageGraphics.draw(s);
        if(shape == Shape.FillCircle) imageGraphics.fill(s);
      }else if(shape == Shape.Box || shape == Shape.FillBox){
        Rectangle2D s = new Rectangle2D.Double(rootx, rooty, w, h);
        imageGraphics.draw(s);
        if(shape == Shape.FillBox) imageGraphics.fill(s);
      }
    }
    g2.drawImage(image, 0, 0, this);
  }
  
  public void draw(){
    repaint(); 
  }
}
