import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int l=in.nextInt();
    int r=in.nextInt();
    l-=1;
    r-=1;

    int[] arr=new int[n];

    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    int min=Integer.MAX_VALUE;
    for(int i=l;i<=r;i++){
     
      if(min>arr[i]){
        min=arr[i];
      }
    }
    System.out.print(min);
    
  }
}
