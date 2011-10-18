/**
 * CompNetWindow.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/18
 * 
 */
package samp2_1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author giginet
 *
 */
public class CompNetWindow extends JFrame{

  
  public CompNetWindow(String windowName){
    setTitle(windowName);
    Container container = getContentPane();
    CompNetPainter painter = new CompNetPainter();
    container.add(painter);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 500);
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
