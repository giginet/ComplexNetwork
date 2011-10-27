/**
 * RandomCluster.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/27
 * 
 */
package exp4_1;

import exp2_1.RandomNetwork;
import samp2_1.Network;
import samp4_2.Cluster;

/**
 * @author giginet
 *
 */
public class RandomCluster extends Cluster{

  private static final int times = 10;
  private static final int N = 50;
  private static final int k = 5;
  
  public RandomCluster(){
    System.out.println(calcClusterAverage(times));
  }
  
  @Override
  protected Network getNetwork(){
    return new RandomNetwork(N, k);
  }
  
  /**
   * @param args
   */
  public static void main(String[] args){
    new RandomCluster();
  }

}
