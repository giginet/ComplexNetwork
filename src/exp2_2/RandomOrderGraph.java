/**
 * RandomOrderGraph.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/21
 * 
 */
package exp2_2;

import exp1_2.MyGraph;

/**
 * @author giginet
 *
 */
public class RandomOrderGraph extends MyGraph{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  protected final int graphXCount = 100;

  public RandomOrderGraph(int size){
    super(size);
    showCenterLine = false;
  }
  
  @Override
  protected String[] getLabels(double[] data){
    String[] labels = new String[data.length];
    for(int i = 0; i < data.length; ++i){
      labels[i] = String.valueOf(i);
    }
    return labels;
  }
  
  @Override
  protected double[] input(){
    double read[] = readFile(inputFile);
    System.out.println(fileLength);
    double result[] = new double[fileLength];
    for(int i=0; i < fileLength; ++i){
      result[i] = read[i];
    }
    return result;
  }
}
