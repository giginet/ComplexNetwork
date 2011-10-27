package samp2_1;

public class CompleteNetwork extends Network{
  
  public CompleteNetwork(int num){
    super(num);
    createLink();
  }

  public void createLink(){
    for(int i = 0; i < nodeNum; ++i){
      for(int j = i + 1; j < nodeNum; ++j){
        setLink(nodes.get(i), nodes.get(j));
      }
    }
    super.createLink();
  }
}
