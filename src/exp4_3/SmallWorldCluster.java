/**
 *  SmallWorldCruster.java 
 *  created by giginet on 2011/10/27
 */
package exp4_3;

import exp3_1.SmallWorldNetwork;
import samp2_1.Network;
import samp4_2.Cluster;

/**
 * @author giginet
 *
 */
public class SmallWorldCluster extends Cluster{

  private static final int N = 50;
  private static final int k = 12;
  private double probability;
  private static final int times = 10;
  
  public SmallWorldCluster(){
    for(double p = 0; p <= 1.00; p += 0.01){
      this.probability = p;
      System.out.println(p + " " + calcClusterAverage(times));
    }
  }
  
  @Override
  protected Network getNetwork(){
    return new SmallWorldNetwork(N, k, probability);
  }
  
  /**
   * @param args
   */
  public static void main(String[] args){
    new SmallWorldCluster();
  }

}
