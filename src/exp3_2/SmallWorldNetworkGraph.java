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
  
  @Override
  protected String[] getLabels(double[] data){
    String[] labels = new String[data.length];
    for(int i = 0; i < data.length; ++i){
      labels[i] = String.valueOf(i);
    }
    return labels;
  }

}
