import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    int s=0;
    for(int i=0;i<n;i++){
      arr[i]+=s;
      s=arr[i];
    }
    
        for(int i=0;i<n;i++){
        System.out.print((arr[i])+" ");
        }


   
   
    
      
  }
}
