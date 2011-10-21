/**
 * RandomCompNetPainter.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/18
 * 
 */
package samp3_1;

import samp2_1.Node;
import samp2_1.CompNetPainter;

/**
 * @author giginet
 *
 */
public class RegularNetPainter extends CompNetPainter{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private int k;
  
  public RegularNetPainter(int nodeNum, int k){
    super(nodeNum);
    this.k = k;
  }
  
  public RegularNetPainter(int k){
    super();
    this.k = k;
  }

  @Override
  protected void createLink(){
    int half = k/2;
    while(!isRegular()){
      for(int i=0;i<nodeNum;++i){
        for(int j=1;j<=half;++j){
          int neighborIndex = (i+j)%nodeNum;
          network.setLink(network.getNode(i), network.getNode(neighborIndex));
        }
      }
    }
  }
  
  /**
   * 全てのノードの次数がkかどうかを判定します
   * @return
   */
  protected boolean isRegular(){
    for(Node node : network.getNodes()){
      if(node.getNeighborCount() != this.k) return false;
    }
    return true;
  }
  
}
