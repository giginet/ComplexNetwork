package exp3_1;

import samp2_1.Network;
import samp2_1.NetworkWindow;

public class SmallWorldNetworkWindow extends NetworkWindow{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private static final int nodeNum = 50;
  private static final int k = 4;
  private static final double p = 0.05;
  
  public SmallWorldNetworkWindow(String windowName){
    super(windowName);
  }
  
  @Override
  protected Network getNetwork(){
    return new SmallWorldNetwork(nodeNum, k, p);
  }
  
  /**
   * 
   * @param args
   */
  public static void main(String[] args){
    SmallWorldNetworkWindow window = new SmallWorldNetworkWindow("SmallWorld Network Window");
    window.setVisible(true);
  }
}
