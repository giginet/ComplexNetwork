package exp1_2;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JPanel;

public class MyGraph extends JPanel{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private int[] hist;
  
  public MyGraph(){
    setBackground(Color.white);
    setSize(1000, 250);
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
      hist[index+50]++;
    }
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    
    g.setColor(Color.black);
    g.drawLine(0, 200, 200, 200);
    g.drawLine(100, 10, 100, 230);
    
    for(int x=0;x<200;x+=10) g.drawLine(x, 205, x, 195);
    for(int y=230;y>10;y-=10) g.drawLine(95, y, 105, y);
    
    g.setColor(Color.blue);
    for(int d=-50; d<hist.length+49; ++d){
      System.out.println(hist[d+50]);
      g.drawRect(d*20, 0, 20, (int)(hist[d+50]*0.1));
    }
  }
}
