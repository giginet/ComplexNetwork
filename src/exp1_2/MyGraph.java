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
  protected static final String inputFile = "output.txt";
  protected final int graphWidth = 800;
  protected final int graphHeight = 800;
  protected final int graphXCount = 100;
  protected int fileLength = 0;
  private int size;
  private double magnifyRate = 0;
  
  public MyGraph(int size){
    setBackground(Color.white);
    this.size = size;
  }
  
  protected double[] readFile(String fileName){
    double[] data = new double[this.size];
    try{
      FileReader fr = new FileReader(fileName);
      BufferedReader br = new BufferedReader(fr);
      String line;
      while((line=br.readLine())!=null){
        StringTokenizer t = new StringTokenizer(line, ",");
        int d = Integer.parseInt(t.nextToken());
        String s = t.nextToken();
        data[d] = Double.parseDouble(s);
        ++fileLength;
      }
      br.close();
    }catch(FileNotFoundException e){
      System.out.println("Don't find your file.");
    }catch(IOException e){
      System.out.println(e);
    }
    return data;
  }
  
  protected double[] input(){
    double[] read = readFile(inputFile);
    double[] hist = new double[this.graphXCount];
    for(int i=0;i<hist.length;++i){
      hist[i] = 0;
    }
    for(int i=0;i<read.length;++i){
      int index = (int)Math.round(read[i]/20);
      if(Math.abs(index) < hist.length/2){
        ++hist[index+hist.length/2];
      }
    }
    return hist;
  }
  
  public double calcMagnifyRate(double[] d){
    int max = 0;
    for(int i=0;i<d.length;++i){
      if(d[i] > max){
        max = (int)d[i];
      }
    }
    return (graphHeight * 0.8)/max;
  }
  
  public void paintComponent(Graphics g){
    double[] data = input();
    magnifyRate = calcMagnifyRate(data);
    super.paintComponent(g);
    g.setColor(Color.black);
    g.drawLine(graphWidth/2, 0, graphWidth/2, graphHeight);
    g.drawLine(0, (int)(graphHeight*0.9), graphWidth, (int)(graphHeight*0.9));
    int barWidth = graphWidth/data.length;
    
    g.setColor(Color.blue);
    for(int d=0; d<data.length; ++d){
      int h = (int)(data[d]*magnifyRate);
      g.drawRect(d*barWidth, (int)(graphHeight*0.9)-h, barWidth, h);
    }
  }
}
