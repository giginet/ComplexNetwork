package samp2_1;

import java.util.ArrayList;

public class Node{
  
  private int id;
  private int x;
  private int y;
  private ArrayList<Node> neighbors;
  
  public Node(int n, int x, int y){
    init(n, x, y);
  }
  
  public Node(int n){
    init(n, 0, 0);
  }
  
  private void init(int n, int x, int y){
    this.id = n;
    setPosition(x, y);
    neighbors = new ArrayList<Node>();
  }
  
  public void setPosition(int x, int y){
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
    Node other = (Node) obj;
    if(id != other.id)
      return false;
    return true;
  }

  /**
   * 指定されたノードと繋ぎます
   * @param n
   */
  public void connect(Node n){
    if(this.equals(n) || isConnect(n)) return;
    neighbors.add(n);
    n.neighbors.add(this);
  }
  
  public boolean isConnect(Node n){
    return this.neighbors.contains(n);
  }
  
  public void disconnect(Node n){
    if(isConnect(n)){
      n.neighbors.remove(n);
      neighbors.remove(n);
    }
  }
  
  public ArrayList<Node> getNeighbors(){
    return this.neighbors;
  }

  public int getNeighborCount(){
    return neighbors.size();
  }
}
