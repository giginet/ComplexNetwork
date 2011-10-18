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
  private MyGraph graph = null;
  private final int count = 100000;
  private final String fileName = "output.txt";
  
  public GraphWindow(String name){
    setTitle(name);
    JLabel titleLabel = new JLabel(fileName);
    Container container = getContentPane();
    OutputData data = new OutputData(count);
    data.out();
    graph = new MyGraph(count);
    container.add(graph, BorderLayout.CENTER);
    container.add(titleLabel, BorderLayout.SOUTH);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setSize(800, 800);
  }
  
  public static void main(String[] args) {
    GraphWindow window = new GraphWindow("Graph Window!");
    window.setVisible(true);
  }

}