import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    int[] w=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    for(int i=0;i<n;i++){
      w[i]=in.nextInt();
    }
    for(int i=0;i<n;i++){
     
      for(int j=i+1;j<n;j++){
          if(w[i]>w[j]){
            w[i]=w[i]+w[j];
            w[j]=w[i]-w[j];
            w[i]=w[i]-w[j];
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
          }
      }
    }
      for(int i=0;i<n;i++)
      System.out.print(arr[i]+" ");
  }
}
