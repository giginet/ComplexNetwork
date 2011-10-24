/**
 * Cluster.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/24
 * 
 */
package samp4_2;

import samp2_1.Network;

/**
 * @author giginet
 *
 */
public class Cluster{
  Network network = null;
  int nodeNum;
  
  public Cluster(Network network, int n){
    this.network = network;
    this.nodeNum = n;
  }
  
  public double calcCluster(){
    int k = 0;
    int e = 0;
    int[] id = new int[nodeNum];
    double coefficient = 0.0;
    
    for(int n1 = 0; n1 < nodeNum; ++n1){
      k = 0;
      e = 0;
      for(int n2 = 0; n2 < nodeNum; ++n2){
        if(network.getMonoNet()[n1][n2] == 1){
          id[k] = n2;
          ++k;
        }
      }
      
      for(int id1 = 0; id1 < k; ++id1){
        for(int id2 = 0; id2 < k; ++id2){
          if(id1 == id2){
            continue;
          }else if(network.getMonoNet()[id[id1]][id[id2]] == 1){
            ++e;
          }
        }
      }
      
      if(k != 0 && k != 1){
        coefficient += (double)((double)(2.0 * e)/(double)(k * (k-1)));
      }
    }
    return (double)(coefficient/(double)(2.0 * nodeNum));
  }
}
