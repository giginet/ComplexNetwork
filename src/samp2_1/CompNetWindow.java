/**
 * CompNetWindow.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/18
 * 
 */
package samp2_1;

import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * @author giginet
 *
 */
public class CompNetWindow extends JFrame{
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public CompNetWindow(String windowName){
    setTitle(windowName);
    Container container = getContentPane();
    CompNetPainter painter = getPainter();
    container.add(painter);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 500);
  }
  
  protected CompNetPainter getPainter(){
    return new CompNetPainter();
  }
  
  /**
   * 
   * @param args
   */
  public static void main(String[] args){
    CompNetWindow window = new CompNetWindow("ComplexNetwork Window");
    window.setVisible(true);
  }

}
