package exp3_1;

import samp2_1.Network;
import samp2_1.NetworkWindow;

public class SmallWorldNetWindow extends NetworkWindow{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private static final int nodeNum = 50;
  private static final int k = 4;
  private static final double p = 0.05;
  
  public SmallWorldNetWindow(String windowName){
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
    SmallWorldNetWindow window = new SmallWorldNetWindow("SmallWorld Network Window");
    window.setVisible(true);
  }
}
