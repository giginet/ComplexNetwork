/**
 * Dijkstra.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/24
 * 
 */
package samp4_1;

import samp2_1.Network;

/**
 * @author giginet
 *
 */
public class Dijkstra{
  
  Network network = null;
  int nodeNum;
  
  public Dijkstra(Network network, int n){
    this.network = network;
    this.nodeNum = n;
  }
  
  public int calcPath(int start){
    int min;
    int p = 0;
    int[] lengthes = new int[nodeNum];
    int[] v = new int[nodeNum];
    
    for(int i = 0; i < nodeNum; ++i){
      lengthes[i] = network.getNoLink();
      v[i] = 0;
    }
    
    lengthes[start] = 0;
    for(int i = 0; i < nodeNum; ++i){
      min = network.getNoLink();
      for(int j = 0; j < nodeNum; ++j){
        if(v[j] == 0 && lengthes[j] < min){
          p = j;
          min = lengthes[j];
        }
      }
      v[p] = 1;
      
      if(min == network.getNoLink()){
        System.out.println("繋がってません");
        
        for(int j = 0; j < nodeNum; ++j){
          if(lengthes[p] + network.getMonoNet()[p][j] < lengthes[j]){
            lengthes[j] = lengthes[p] + network.getMonoNet()[p][j];
          }
        }
      }
    }
    
    int sum = 0;
    for(int i=0; i < nodeNum; ++i){
      sum += lengthes[i];
    }
    return sum;
  }
}
