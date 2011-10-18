package samp2_1;

public class Node{
  
  private static int nodeId = 0;
  private int id;
  private int x;
  private int y;
  
  public Node(int x, int y){
    this.id = nodeId;
    ++nodeId;
    this.x = x;
    this.y = y;
  }

  /**
   * @return the id
   */
  public int getId(){
    return id;
  }

  /**
   * @return the x
   */
  public int getX(){
    return x;
  }

  /**
   * @return the y
   */
  public int getY(){
    return y;
  }
  
}
