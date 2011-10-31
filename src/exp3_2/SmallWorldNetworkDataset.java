/**
 * SmallWorldNetworkDataset.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/25
 * 
 */
package exp3_2;

import samp2_1.Network;
import exp2_2.RandomOrderDataset;
import exp3_1.SmallWorldNetwork;

/**
 * @author giginet
 *
 */
public class SmallWorldNetworkDataset extends RandomOrderDataset{

  protected final static int nodeNum = 100;
  protected final static int k = 4;
  private final static double p = 0.5;
  protected final static int N = 10;
  
  @Override
  protected Network getNetwork(){
    return new SmallWorldNetwork(nodeNum, k, p);
  }

}
