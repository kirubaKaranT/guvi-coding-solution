import java.util.*;

public class Main {
  static boolean[] arr;
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }   
    
    int c=0;
    for(int i=0;i<n;i++){
        if(arr[i]!=0){
          System.out.print(arr[i]+" ");        
        }
        else{
          c++;
        }
    }
    
  
    while(c-->0)  
    System.out.print(0+" ");
    
  }

}
