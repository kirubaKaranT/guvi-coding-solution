import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int l=in.nextInt();
    int c=0;

    int[] arr=new int[n];

    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    
    for(int i=0;i<n;i++){
     
      if(arr[i]==l){
        c++;
      }
    }
    if(c!=0)
    System.out.print("yes "+c);
    else
    System.out.print("no");
    
  }
}
