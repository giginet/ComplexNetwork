package exp1_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class OutputData{
  
  private double[] data;
  private final String outputFile = "output.txt";
  protected int count;
  
  public OutputData(int count){
    this.count = count;
    this.data = this.prepareData();
  }
  
  public void setData(double[] data){
    this.data = data;
  }
  
  public void output(){
    try{
      FileWriter fw = new FileWriter(outputFile);
      
      BufferedWriter bw = new BufferedWriter(fw);
      
      for(int d=0;d <data.length;++d) bw.write("" + d + "," + data[d] + "\n");
      bw.close();
    }catch(IOException e){
      System.out.println(e);
    }
  }
  
  protected double[] prepareData(){
    Random r = new Random();
    double[] data = new double[count];
    for(int i=0;i<data.length;++i){
      data[i] = r.nextGaussian() * 200;
    }
    return data;
  }
}
