/**
 * RandomNetwork.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/21
 * 
 */
package exp2_1;

import java.util.Random;

import samp2_1.Network;

/**
 * @author giginet
 *
 */
public class RandomNetwork extends Network{
  protected int k = 1;
  
  public RandomNetwork(int nodeNum){
    super(nodeNum);
  }
  
  public RandomNetwork(int nodeNum, int k){
    super(nodeNum);
    this.k = k;
  }
  
  @Override
  protected void createLink(){
    Random rand = new Random();
    for(int i = 0; i < nodeNum; ++i){
      for(int j = i + 1; j < nodeNum; ++j){
        double p = (double)k/(nodeNum-1);
        if(rand.nextDouble() < p){
          setLink(nodes.get(i), nodes.get(j));
        }
      }
    }
  }
}
