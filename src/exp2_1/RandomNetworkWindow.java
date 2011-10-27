package exp2_1;

import samp2_1.Network;
import samp2_1.NetworkWindow;

public class RandomNetworkWindow extends NetworkWindow{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private static final int k = 5;
  
  public RandomNetworkWindow(String windowName){
    super(windowName);
  }
  
  protected Network getNetwork(){
    return new RandomNetwork(nodeNum, k);
  }
  
  /**
   * 
   * @param args
   */
  public static void main(String[] args){
    RandomNetworkWindow window = new RandomNetworkWindow("Random ComplexNetwork Window");
    window.setVisible(true);
  }
}
