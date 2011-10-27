/**
 * SmallWorldDijkstra.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/27
 * 
 */
package exp4_3;

import exp3_1.SmallWorldNetwork;
import samp2_1.Network;
import samp4_1.Dijkstra;

/**
 * @author giginet
 *
 */
public class SmallWorldDijkstra extends Dijkstra{

  private final static int N = 50;
  private final static int k = 12;
  private double probability;
  
  @Override
  protected Network getNetwork(){
    return new SmallWorldNetwork(N, k, probability);
  }
  
  /**
   * @param args
   */
  public static void main(String[] args){
    // TODO Auto-generated method stub

  }

}
