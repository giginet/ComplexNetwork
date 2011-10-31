/**
 * SmallWorldNetworkGraph.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/25
 * 
 */
package exp3_2;

import exp2_2.RandomOrderGraph;

/**
 * @author giginet
 *
 */
public class SmallWorldNetworkGraph extends RandomOrderGraph{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public SmallWorldNetworkGraph(int size){
    super(size);
    showCenterLine = false;
  }
  
}
