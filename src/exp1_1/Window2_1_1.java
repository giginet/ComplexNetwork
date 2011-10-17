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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author giginet
 *
 */
public class Window2_1_1 extends JFrame{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private Painter2_1_1 painter;
  
  public Window2_1_1(String windowName){
    setTitle(windowName);
    Container container = getContentPane();
    painter = new Painter2_1_1();
    JButton drawButton = new JButton("draw");
    drawButton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        painter.draw();
      }
    });
    container.add(painter, BorderLayout.CENTER);
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
