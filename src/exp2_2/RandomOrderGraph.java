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
    return readFile(inputFile);
  }

  /**
   * @param args
   */
  public static void main(String[] args){
    // TODO Auto-generated method stub

  }

}
