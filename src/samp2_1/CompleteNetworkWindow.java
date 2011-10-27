/**
 *  CompleteNetworkWindow.java 
 *  created by giginet on 2011/10/27
 */
package samp2_1;

/**
 * @author giginet
 *
 */
public class CompleteNetworkWindow extends NetworkWindow{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public CompleteNetworkWindow(String windowName){
    super(windowName);
  }
  
  protected Network getNetwork(){
    return new CompleteNetwork(nodeNum);
  }

  /**
   * 
   * @param args
   */
  public static void main(String[] args){
    NetworkWindow window = new CompleteNetworkWindow("ComplexNetwork Window");
    window.setVisible(true);
  }

}
