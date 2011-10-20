package samp3_1;

import samp2_1.CompNetPainter;
import samp2_1.CompNetWindow;

public class RegularNetWindow extends CompNetWindow{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private static final int nodeNum = 10;
  private static final int k = 4;
  
  public RegularNetWindow(String windowName){
    super(windowName);
  }
  
  protected CompNetPainter getPainter(){
    return new RegularNetPainter(nodeNum, k);
  }
  
  /**
   * 
   * @param args
   */
  public static void main(String[] args){
    RegularNetWindow window = new RegularNetWindow("Regular Network Window");
    window.setVisible(true);
  }
}
