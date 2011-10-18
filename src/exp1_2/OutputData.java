package exp1_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class OutputData{
  
  double[] data;
  
  public OutputData(int count){
    Random r = new Random();
    data = new double[count];
    for(int i=0;i<data.length;++i){
      data[i] = r.nextGaussian() * 200;
    }
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
}
