package samp2_1;

public class Link{
  
  private static int linkId = 0;
  private Node node1 = null;
  private Node node2 = null;
  
  int id;
  
  public Link(Node n1, Node n2){
    this.id = linkId;
    ++linkId;
    this.node1 = n1;
    this.node2 = n2;
  }

  /**
   * @return the id
   */
  public int getId(){
    return id;
  }

  /**
   * @return the node1
   */
  public Node getNode1(){
    return node1;
  }

  /**
   * @return the node2
   */
  public Node getNode2(){
    return node2;
  }

}
