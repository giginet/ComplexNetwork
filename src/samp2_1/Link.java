package samp2_1;

public class Link{
  
  private Node node1 = null;
  private Node node2 = null;
  
  int id;
  
  public Link(int id, Node n1, Node n2){
    this.id = id;
    this.node1 = n1;
    this.node2 = n2;
  }
  
  

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode(){
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj){
    if(this == obj)
      return true;
    if(obj == null)
      return false;
    if(getClass() != obj.getClass())
      return false;
    Link other = (Link) obj;
    if(id != other.id)
      return false;
    return true;
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
