/**
 *  RandomDijkstra.java 
 *  created by giginet on 2011/10/27
 */
package exp4_1;

import exp2_1.RandomNetwork;
import samp2_1.Network;
import samp4_1.Dijkstra;

/**
 * @author giginet
 *
 */
public class RandomDijkstra extends Dijkstra{

  private static final int times = 10;
  private static final int N = 50;
  private static final int k = 5;
  
  public RandomDijkstra(){
    System.out.println(calcPathAverage(times));
  }
  
  @Override
  protected Network getNetwork(){
    return new RandomNetwork(N, k);
  }
  
  public static void main(String args[]){
      new RandomDijkstra();
  }
  
}
