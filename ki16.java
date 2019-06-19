import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    
    int n=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    } 
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

    for(int i=0;i<n;i++){
      int k=arr[i]; 
        if(map.containsKey(k)){
          int f=map.get(k);
          map.put(k,f+1);
        }  
      else{
        map.put(k,1);
      }
    }
    for(Integer i:map.keySet()){
      if(map.get(i)==1){
    System.out.print(i);
    System.exit(0);    
      }
    }
    
      
  }
}
