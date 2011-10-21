/**
 * SmallWorldNetPainter.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/21
 * 
 */
package exp3_1;

import java.util.Random;

import javax.swing.text.html.HTMLDocument.Iterator;

import samp2_1.Node;
import samp3_1.RegularNetPainter;

/**
 * @author giginet
 *
 */
public class SmallWorldNetPainter extends RegularNetPainter{

  private static final long serialVersionUID = 1L;
  private double probability;
  
  public SmallWorldNetPainter(int k){
    super(k);
  }

  public SmallWorldNetPainter(int nodeNum, int k){
    super(nodeNum, k);
  }
  
  public SmallWorldNetPainter(int nodeNum, int k, double p){
    super(nodeNum, k);
    this.probability = p;
  }
  
  @Override
  protected void createLink(){
    super.createLink();
    Random rand = new Random();
    for(Node node : nodes){
      if(rand.nextDouble() < this.probability){
        network.setLink(node, nodes.get(rand.nextInt(nodeNum)));
      }
    }
  }

}
