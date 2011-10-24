package samp2_1;

import java.util.ArrayList;

public class Network{
  
  private ArrayList<Link> links = null;  
  protected ArrayList<Node> nodes = null;
  protected int nodeNum;
  private int[][] net = null;
  private int[][] monoNet = null;
  private int noLink;
  
  public Network(int num){
    nodeNum = num;
    net = new int[num][num];
    nodes = new ArrayList<Node>();
    noLink = 2*num*num;
    for(int i=0;i<num;++i){
      for(int j=0;j<num;++j){
        net[i][j] = noLink;
      }
    }
    links = new ArrayList<Link>();
    monoNet = this.createMonoNet();
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
  
  public double[] getOrders(){
    double orders[] = new double[nodes.size()];
    for(Node node : nodes){
      int order = node.getNeighborCount();
      ++orders[order];
    }
    return orders;
  }
  
  /**
   * @return the noLink
   */
  public int getNoLink(){
    return noLink;
  }

  /**
   * @return the nodeNum
   */
  public int getNodeNum(){
    return nodeNum;
  }
  
  public void createNode(int x, int y){
    nodes.add(new Node(x, y));
  }

  public void createLink(){
    for(int i = 0; i < nodeNum; ++i){
      for(int j = i + 1; j < nodeNum; ++j){
        setLink(nodes.get(i), nodes.get(j));
      }
    }
  }
  
  private int[][] createMonoNet(){
    int[][] mono = new int[nodeNum][nodeNum]; 
    for(int n1 = 0; n1 < nodes.size(); ++n1){
      for(int n2 = 0; n2 < nodes.size(); ++n2){
        if(n1 == n2){
          mono[n1][n2] = 0;
        }else if(net[n1][n2] < noLink){
          mono[n1][n2] = 1;
        }else{
          mono[n1][n2] = noLink;
        }
      }
    }
    return mono;
  }

  /**
   * @return the monoNet
   */
  public int[][] getMonoNet(){
    return monoNet;
  }
  
}