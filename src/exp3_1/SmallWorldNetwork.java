/**
 * RandomNetwork.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/21
 * 
 */
package exp3_1;

import samp3_1.RegularNetwork;

/**
 * @author giginet
 *
 */
public class SmallWorldNetwork extends RegularNetwork{
  protected int k = 1;
  
  public SmallWorldNetwork(int nodeNum, int k, double p){
    super(nodeNum, k);
    this.probability = p;
    createLink();
  }
  
  @Override
  public void createLink(){
    super.createLink();
    for(int i=0; i < nodeNum; ++i){
      reconnect(i);
    }
  }
}
