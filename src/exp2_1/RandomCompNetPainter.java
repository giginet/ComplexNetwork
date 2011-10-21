/**
 * RandomCompNetPainter.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/18
 * 
 */
package exp2_1;

import java.util.Random;

import samp2_1.NetworkPainter;

/**
 * @author giginet
 *
 */
public class RandomCompNetPainter extends NetworkPainter{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private int k = 10;
  
  public RandomCompNetPainter(int nodeNum, int k){
    super(nodeNum);
    this.k = k;
  }
  
  public RandomCompNetPainter(int k){
    super();
    this.k = k;
  }

  @Override
  protected void createLink(){
    Random rand = new Random();
    for(int i = 0; i < nodeNum; ++i){
      for(int j = i + 1; j < nodeNum; ++j){
        double p = (double)k/(nodeNum-1);
        if(rand.nextDouble() < p){
          network.setLink(network.getNode(i), network.getNode(j));
        }
      }
    }
  }
}
