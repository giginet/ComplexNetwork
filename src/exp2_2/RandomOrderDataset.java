package exp2_2;

import exp1_2.OutputData;
import exp2_1.RandomNetwork;

public class RandomOrderDataset extends OutputData{

  private final static int nodeNum = 50;
  private final static int k = 12;
  
  public RandomOrderDataset(){
    super(nodeNum);
  }
  
  @Override
  protected double[] prepareData(){
    RandomNetwork network = new RandomNetwork(nodeNum, k);
    for(int i = 0; i < nodeNum; ++i){
      network.createNode(0, 0);
    }
    network.createLink();
    return network.getOrders();
  }

}
