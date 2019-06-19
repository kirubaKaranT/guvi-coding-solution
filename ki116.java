import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }

    for(int i=0;i<n;i++){
      if(map.containsKey(arr[i])){
        map.put(arr[i],map.get(arr[i])+1);
      }
      else{
         map.put(arr[i],1);
      }
    }

    while(n>0){
      ArrayList<Integer> list=new ArrayList<Integer>();
      for(Integer k:map.keySet()){
          if(map.get(k)==n){
              list.add(k);
          }
      }
      Collections.sort(list);
      for(int i=list.size()-1;i>=0;i--){
        System.out.print(list.get(i)+" ");
      }
      n-=1;
    }

   
    
      
  }
}
