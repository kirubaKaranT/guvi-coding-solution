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
    map.put(arr[i],i+1);
   }
   Arrays.sort(arr);

   for(int i=0;i<n;i++)
   System.out.print(map.get(arr[i])+" ");
    
      
  }
}
