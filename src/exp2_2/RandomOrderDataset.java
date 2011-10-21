package exp2_2;

import exp1_2.OutputData;

public class RandomOrderDataset extends OutputData{

  private final static int nodeNum = 50;
  
  public RandomOrderDataset(){
    super(nodeNum);
  }
  
  @Override
  protected double[] prepareData(){
    /*System.out.println("aaa");
    RandomNetwork network = new RandomNetwork(nodeNum);
    return network.getOrders();*/
    return new double[50];
  }

}
