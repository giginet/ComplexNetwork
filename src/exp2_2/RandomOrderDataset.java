package exp2_2;

import samp2_1.Network;
import exp1_2.OutputData;
import exp2_1.RandomNetwork;

public class RandomOrderDataset extends OutputData{

  protected final static int nodeNum = 50;
  protected final static int k = 12;
  protected final static int N = 10;
  
  public RandomOrderDataset(){
    super(nodeNum);
  }
  
  protected Network getNetwork(){
    return new RandomNetwork(nodeNum, k);
  }
  
  @Override
  protected double[] prepareData(){
    double orders[] = new double[nodeNum];
    int max = 0;
    for(int n = 0; n < 10; ++n){
      Network network = getNetwork();
      double[] order = network.getOrders();
      if(max < order.length){
        max = order.length;
      }
      for(int i = 0; i < order.length; ++i){
        orders[i] += order[i];
      }
    }
    double result[] = new double[max];
    for(int i = 0; i < max; ++i){
      result[i] = orders[i];
    }
    return result;
  }

}
