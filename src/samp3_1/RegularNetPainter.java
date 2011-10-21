/**
 * RandomCompNetPainter.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/18
 * 
 */
package samp3_1;

import java.util.Iterator;
import java.util.Random;

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
    while(!this.isRegular()){
      Iterator<Node> itr = nodes.iterator();
      while(itr.hasNext()){
        Node n1 = itr.next();
        if(n1.getNeighborCount() < this.k){
          Iterator<Node> itr2 = nodes.iterator();
          while(itr2.hasNext()){
            Node n2 = itr2.next();
            if(!n1.equals(n2) && n2.getNeighborCount() < this.k){
              System.out.println(n2.getNeighborCount());
              network.setLink(n1, n2);
              break;
            }
          }
        }
      }
    }
  }
  
  /**
   * 全てのノードの次数がkかどうかを判定します
   * @return
   */
  protected boolean isRegular(){
    Iterator<Node> itr = nodes.iterator();
    while(itr.hasNext()){
      if(itr.next().getNeighborCount() != this.k) return false;
    }
    return true;
  }
  
}
