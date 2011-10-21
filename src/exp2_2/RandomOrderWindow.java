/**
 * RandomOrderWindow.java
 * ComplexNetwork
 *
 * Created by giginet on 2011/10/21
 * 
 */
package exp2_2;

import exp1_2.GraphWindow;
import exp1_2.OutputData;

/**
 * @author giginet
 *
 */
public class RandomOrderWindow extends GraphWindow{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public RandomOrderWindow(String name){
    super(name);
  }

  @Override
  protected OutputData getOutput(){
    System.out.println("ooo");
    return new RandomOrderDataset();
  }
  
  public static void main(String[] args) {
    GraphWindow window = new GraphWindow("Random Order Graph Window");
    window.setVisible(true);
  }

}
