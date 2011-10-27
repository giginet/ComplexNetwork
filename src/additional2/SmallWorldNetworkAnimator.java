/**
 *  NetworkAnimator.java 
 *  created by giginet on 2011/10/27
 */
package additional2;

import samp2_1.Network;
import samp2_1.NetworkPainter;
import samp3_1.RegularNetwork;

/**
 * @author giginet
 *
 */
public class SmallWorldNetworkAnimator extends NetworkPainter implements Runnable{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private RegularNetwork regularNet;
  private int nodeIndex = 0;
  
  public SmallWorldNetworkAnimator(Network net){
    super(net);
    regularNet = (RegularNetwork)net;
  }
  
  /* (non-Javadoc)
   * @see java.lang.Runnable#run()
   */
  @Override
  public void run(){
    while(true){
      action();
      repaint();
      try{
        Thread.sleep(100);
      }catch(InterruptedException e){
        e.printStackTrace();
      }
    }
  }
  
  protected void action(){
    if(nodeIndex < nodeNum){
      regularNet.reconnect(nodeIndex);
      ++nodeIndex;
    }
  }

}
