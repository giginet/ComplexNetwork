package exp1_2;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GraphWindow extends JFrame {

  MyGraph graph = null;
  
  public GraphWindow(String name){
    setTitle(name);
    JLabel titleLabel = new JLabel("output.txt");
    Container container = getContentPane();
    OutputData data = new OutputData();
    data.out();
    graph = new MyGraph();
    container.add(graph, BorderLayout.CENTER);
    container.add(titleLabel, BorderLayout.SOUTH);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setSize(1000, 280);
  }
  
  public static void main(String[] args) {
    GraphWindow window = new GraphWindow("Graph Window!");
    window.setVisible(true);
  }

}