package exp1_2;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.Math;

import javax.swing.JPanel;


public class MyGraph extends JPanel{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private int[] hist;
  private final int graphWidth = 800;
  private final int graphHeight = 800;
  
  public MyGraph(){
    setBackground(Color.white);
    this.in();
  }
  
  private void in(){
    double[] data = new double[10000];
    try{
      FileReader fr = new FileReader("output.txt");
      BufferedReader br = new BufferedReader(fr);
      String line;
      while((line=br.readLine())!=null){
        StringTokenizer t = new StringTokenizer(line, ",");
        int d = Integer.parseInt(t.nextToken());
        String s = t.nextToken();
        data[d] = Double.parseDouble(s);
      }
      br.close();
    }catch(FileNotFoundException e){
      System.out.println("Don't find your file.");
    }catch(IOException e){
      System.out.println(e);
    }
    hist = new int[100];
    for(int i=0;i<hist.length;++i){
      hist[i] = 0;
    }
    for(int i=0;i<data.length;++i){
      int index = (int)(data[i]/20);
      if(Math.abs(index) < hist.length/2){
        ++hist[index+hist.length/2];
      }
    }
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    
    g.setColor(Color.black);
    g.drawLine(graphWidth/2, 0, graphWidth/2, graphHeight);
    g.drawLine(0, (int)(graphHeight*0.9), graphWidth, (int)(graphHeight*0.9));
    int barWidth = graphWidth/hist.length;
    
    g.setColor(Color.blue);
    for(int d=0; d<hist.length; ++d){
      int h = (int)(hist[d]*0.5);
      g.drawRect((int)((d-0.5)*barWidth), (int)(graphHeight*0.9)-h, barWidth, h);
    }
  }
}
