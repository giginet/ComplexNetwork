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
public class NetworkWindow extends JFrame{
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  protected static final int nodeNum = 50; 

  public NetworkWindow(String windowName){
    setTitle(windowName);
    Container container = getContentPane();
    NetworkPainter painter = getPainter();
    container.add(painter);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 500);
  }
  
  protected NetworkPainter getPainter(){
    return new NetworkPainter(new Network(nodeNum));
  }
  
  /**
   * 
   * @param args
   */
  public static void main(String[] args){
    NetworkWindow window = new NetworkWindow("ComplexNetwork Window");
    window.setVisible(true);
  }

}
