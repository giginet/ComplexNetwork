/**
 * Window2_1_1.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/17
 * 
 */
package exp1_1;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author giginet
 *
 */
public class Window2_1_1 extends JFrame{
  public Window2_1_1(String windowName){
    setTitle(windowName);
    Container container = getContentPane();
    JButton drawButton = new JButton("draw");
    container.add(drawButton, BorderLayout.SOUTH);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 500);
  }
  
  /**
   * @param args
   */
  public static void main(String[] args){
    Window2_1_1 window = new Window2_1_1("Paint Window");
    window.setVisible(true);
  }
}
