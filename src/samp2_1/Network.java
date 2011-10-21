package samp2_1;

import java.util.ArrayList;

public class Network{
  
  private ArrayList<Link> links = null;  
  protected ArrayList<Node> nodes = null;
  private int[][] net = null;
  private int noLink;
  
  public Network(int num){
    net = new int[num][num];
    nodes = new ArrayList<Node>();
    noLink = 2*num*num;
    for(int i=0;i<num;++i){
      for(int j=0;j<num;++j){
        net[i][j] = noLink;
      }
    }
    links = new ArrayList<Link>();
  }
  
  public void setLink(Node n1, Node n2){
    Link link = new Link(n1, n2);
    links.add(link);
    net[n1.getId()][n2.getId()] = link.getId();
    net[n2.getId()][n1.getId()] = link.getId();
    n1.connect(n2);
  }
  
  public boolean isLink(Node n1, Node n2){
    return !(net[n1.getId()][n2.getId()] == noLink || net[n2.getId()][n1.getId()] == noLink);
  }
  
  public Node getNode(int index){
    return nodes.get(index);
  }
  
  public ArrayList<Node> getNodes(){
    return nodes;
  }
  
}