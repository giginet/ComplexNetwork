/**
 * CompNetWindow.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/18
 * 
 */
package samp2_1;

import java.awt.Container;
import javax.swing.JFrame;

/**
 * @author giginet
 *
 */
public abstract class NetworkWindow extends JFrame{
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  protected static final int nodeNum = 50; 

  public NetworkWindow(String windowName){
    setTitle(windowName);
    Container container = getContentPane();
    NetworkPainter painter = new NetworkPainter(getNetwork());
    container.add(painter);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 500);
  }
  
  protected Network getNetwork(){
    return null;
  }

}
