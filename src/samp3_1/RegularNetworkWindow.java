package samp3_1;

import samp2_1.Network;
import samp2_1.NetworkWindow;

public class RegularNetworkWindow extends NetworkWindow{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private static final int nodeNum = 10;
  private static final int k = 4;
  
  public RegularNetworkWindow(String windowName){
    super(windowName);
  }
  
  protected Network getNetwork(){
    return new RegularNetwork(nodeNum, k);
  }
  
  /**
   * 
   * @param args
   */
  public static void main(String[] args){
    RegularNetworkWindow window = new RegularNetworkWindow("Regular Network Window");
    window.setVisible(true);
  }
}
