/**
 * RegularNetworkGraphWindow.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/25
 * 
 */
package exp3_2;

import exp1_2.GraphWindow;
import exp1_2.MyGraph;
import exp1_2.OutputData;

/**
 * @author giginet
 *
 */
public class RegularNetworkGraphWindow extends GraphWindow{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public RegularNetworkGraphWindow(String name){
    super(name);
  }
  
  @Override
  protected OutputData getOutput(){
    return new RegularNetworkDataset();
  }
  
  @Override
  protected MyGraph getGraph(){
    return new RegularNetworkGraph(50);
  }

  /**
   * @param args
   */
  public static void main(String[] args){
    RegularNetworkGraphWindow window = new RegularNetworkGraphWindow("Regular Network Graph Window!");
    window.setVisible(true);
  }

}
