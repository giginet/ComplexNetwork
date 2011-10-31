/**
 * RandomNetwork.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/21
 * 
 */
package samp3_1;

import java.util.Random;

import samp2_1.Network;
import samp2_1.Node;

/**
 * @author giginet
 *
 */
public class RegularNetwork extends Network{
  protected int k = 1;
  protected double probability;
  
  public RegularNetwork(int nodeNum){
    super(nodeNum);
  }
  
  public RegularNetwork(int nodeNum, int k){
    super(nodeNum);
    this.k = k;
    createLink();
  }
  
  public RegularNetwork(int nodeNum, int k, double p){
    super(nodeNum);
    this.k = k;
    this.probability = p;
    createLink();
  }
  
  @Override
  public void createLink(){
    int half = k/2;
    while(!isRegular()){
      for(int i = 0; i < nodeNum; ++i){
        for(int j = 1; j <= half; ++j){
          int neighborIndex = (i + j) % nodeNum;
          setLink(nodes.get(i), nodes.get(neighborIndex));
        }
      }
    }
    super.createLink();
  }
  
  /**
   * i番目のノードについて、つなぎ替えを行うか判定してつなぎ替えます（アニメーション用）
   * @param i
   */
  public void reconnect(int i){
    Random rand = new Random();
    Node node = nodes.get(i);
    if(rand.nextDouble() < this.probability){
      if(removeLink(node, node.getNeighbors().get(rand.nextInt(node.getNeighborCount())))){
        setLink(node, nodes.get(rand.nextInt(nodeNum)));
      }
    }
    monoNet = createMonoNet();
  }
  
  /**
   * 全てのノードの次数がkかどうかを判定します
   * @return
   */
  protected boolean isRegular(){
    for(Node node : nodes){
      if(node.getNeighborCount() != this.k) return false;
    }
    return true;
  }

}
