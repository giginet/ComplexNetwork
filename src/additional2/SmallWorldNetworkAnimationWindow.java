/**
 *  SmallWorldNetworkAnimationWindow.java 
 *  created by giginet on 2011/10/27
 */
package additional2;

import java.awt.Container;

import javax.swing.JFrame;

import samp2_1.Network;
import samp2_1.NetworkPainter;
import samp3_1.RegularNetwork;

/**
 * @author giginet
 *
 */
public class SmallWorldNetworkAnimationWindow extends JFrame{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private static final int nodeNum = 100;
  private static final int k = 4;
  private static final double p = 0.3;
  
  public SmallWorldNetworkAnimationWindow(String windowName){
    setTitle(windowName);
    Container container = getContentPane();
    SmallWorldNetworkAnimator animator = new SmallWorldNetworkAnimator(getNetwork());
    container.add(animator);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1000, 667);
    Thread thread = new Thread(animator);
    
    thread.start();
  }
  
  protected Network getNetwork(){
    return new RegularNetwork(nodeNum, k, p);
  }
  
  protected NetworkPainter getPainter(){
    return new SmallWorldNetworkAnimator(getNetwork());
  }

  /**
   * @param args
   */
  public static void main(String[] args){
    SmallWorldNetworkAnimationWindow window = new SmallWorldNetworkAnimationWindow("SmallWorld Network Animation Window");
    window.setVisible(true);
  }

}
