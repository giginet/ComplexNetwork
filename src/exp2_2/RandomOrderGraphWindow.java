/**
 * RandomOrderWindow.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/21
 * 
 */
package exp2_2;

import exp1_2.GraphWindow;
import exp1_2.MyGraph;
import exp1_2.OutputData;

/**
 * @author giginet
 *
 */
public class RandomOrderGraphWindow extends GraphWindow{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  protected final int graphXCount = 100;
  
  public RandomOrderGraphWindow(String name){
    super(name);
    // TODO Auto-generated constructor stub
  }
  
  @Override
  protected OutputData getOutput(){
    return new RandomOrderDataset();
  }
  
  @Override
  protected MyGraph getGraph(){
    return new RandomOrderGraph(50);
  }
  
  public static void main(String[] args) {
    RandomOrderGraphWindow window = new RandomOrderGraphWindow("Random Order Graph Window");
    window.setVisible(true);
  }

}