import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    String[] arr=new String[n];
    for(int i=0;i<n;i++){
      arr[i]=in.next();
    }
    for(int i=0;i<n-1;i++){
      if(arr[i].equals(arr[i+1])){
        System.out.print("yes");
        System.exit(0);
      }
    }
    
      System.out.print("no");
  }
}
