/**
 * SmallWorldNetworkGraphWindow.java
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
public class SmallWorldNetworkGraphWindow extends GraphWindow{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public SmallWorldNetworkGraphWindow(String name){
    super(name);
  }
  
  @Override
  protected OutputData getOutput(){
    return new SmallWorldNetworkDataset();
  }
  
  @Override
  protected MyGraph getGraph(){
    return new SmallWorldNetworkGraph(50);
  }

  /**
   * @param args
   */
  public static void main(String[] args){
    SmallWorldNetworkGraphWindow window = new SmallWorldNetworkGraphWindow("SmallWorldNetwork Graph Window!");
    window.setVisible(true);
  }

}
