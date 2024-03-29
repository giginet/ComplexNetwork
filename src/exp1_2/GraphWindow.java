package exp1_2;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GraphWindow extends JFrame {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  protected MyGraph graph = null;
  protected final int count = 1000000;
  protected final String fileName = "output.txt";
  
  public GraphWindow(String name){
    setTitle(name);
    JLabel titleLabel = new JLabel(fileName);
    Container container = getContentPane();
    OutputData data = getOutput();
    data.output();
    graph = getGraph();
    container.add(graph, BorderLayout.CENTER);
    container.add(titleLabel, BorderLayout.SOUTH);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setSize(1200, 1200);
  }
  
  protected OutputData getOutput(){
    return new OutputData(count);
  }
  
  protected MyGraph getGraph(){
    return new MyGraph(count);
  }
  
  public static void main(String[] args) {
    GraphWindow window = new GraphWindow("Graph Window!");
    window.setVisible(true);
  }

}