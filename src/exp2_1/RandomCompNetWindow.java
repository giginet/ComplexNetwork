package exp2_1;

import samp2_1.NetworkPainter;
import samp2_1.NetworkWindow;

public class RandomCompNetWindow extends NetworkWindow{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private static final int k = 5;
  
  public RandomCompNetWindow(String windowName){
    super(windowName);
  }
  
  protected NetworkPainter getPainter(){
    return new RandomCompNetPainter(k);
  }
  
  /**
   * 
   * @param args
   */
  public static void main(String[] args){
    RandomCompNetWindow window = new RandomCompNetWindow("Random ComplexNetwork Window");
    window.setVisible(true);
  }
}
