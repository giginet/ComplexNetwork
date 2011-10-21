package exp1_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class OutputData{
  
  double[] data;
  
  public OutputData(int count){
    data = new double[count];
    this. data = this.prepareData();
  }
  
  public void setData(double[] data){
    this.data = data;
  }
  
  public void out(){
    try{
      FileWriter fw = new FileWriter("output.txt");
      
      BufferedWriter bw = new BufferedWriter(fw);
      
      for(int d=0;d <data.length;++d) bw.write(""+d+","+data[d]+"\n");
      bw.close();
    }catch(IOException e){
      System.out.println(e);
    }
  }
  
  protected double[] prepareData(){
    Random r = new Random();
    double[] data = new double[this.data.length];
    for(int i=0;i<data.length;++i){
      data[i] = r.nextGaussian() * 200;
    }
    return data;
  }
}
