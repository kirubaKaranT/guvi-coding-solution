import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int  n=in.nextInt();
    int k=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    for(int i=0;i<k;i++){
      for(int j=i+1;j<k;j++){
        if(arr[i]>arr[j]){
          arr[i]=arr[i]+arr[j];
          arr[j]=arr[i]-arr[j];
          arr[i]=arr[i]-arr[j];
        }
      }
    }
    for(int i=k;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]<arr[j]){
          arr[i]=arr[i]+arr[j];
          arr[j]=arr[i]-arr[j];
          arr[i]=arr[i]-arr[j];
        }
      }
    }

      for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  
  }
}
