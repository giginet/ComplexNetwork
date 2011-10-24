/**
 * RandomNetwork.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/21
 * 
 */
package exp3_1;

import java.util.Random;

import samp2_1.Node;
import samp3_1.RegularNetwork;

/**
 * @author giginet
 *
 */
public class SmallWorldNetwork extends RegularNetwork{
  protected int k = 1;
  private double probability;
  
  public SmallWorldNetwork(int nodeNum, int k, double p){
    super(nodeNum, k);
    this.probability = p;
  }
  
  @Override
  public void createLink(){
    super.createLink();
    Random rand = new Random();
    for(Node node : nodes){
      if(rand.nextDouble() < this.probability){
        setLink(node, nodes.get(rand.nextInt(nodeNum)));
      }
    }
  }
}
