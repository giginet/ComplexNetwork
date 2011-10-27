/**
 * RegularNetworkDataset.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/25
 * 
 */
package exp3_2;

import samp2_1.Network;
import samp3_1.RegularNetwork;
import exp2_2.RandomOrderDataset;
import exp3_1.SmallWorldNetwork;

/**
 * @author giginet
 *
 */
public class RegularNetworkDataset extends RandomOrderDataset{

  protected final static int nodeNum = 1000;
  protected final static int k = 4;
  private final static double p = 0.0;
  protected final static int N = 1;
  
  @Override
  protected Network getNetwork(){
    //return new RegularNetwork(nodeNum, k);
    return new SmallWorldNetwork(nodeNum, k, p);
  }

}
