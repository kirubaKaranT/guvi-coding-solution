import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int max=0;
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
      if(max<arr[i]){
        max=arr[i];
      }
    }
    int[] a=new  int[k];
    for(int i=0;i<k;i++){
      a[i]=in.nextInt();
    }
    
    for(int i=0;i<k;i++){
    if(max>a[i])
    System.out.print(max+" ");
    else{
      System.out.print(a[i]+" ");
      max=a[i];
    }
    }


   
   
    
      
  }
}
