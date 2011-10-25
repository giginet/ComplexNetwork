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

  public RandomOrderGraph(int size){
    super(size);
  }
  
  @Override
  protected double[] input(){
    double read[] = readFile(inputFile);
    double result[] = new double[fileLength];
    for(int i=0; i < fileLength; ++i){
      result[i] = read[i];
    }
    return result;
  }
}
