import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    int[][] arr=new int[n][2];
    for(int i=0;i<n;i++){
      int u=in.nextInt();
      int v=in.nextInt();
      arr[i][0]=u;
      arr[i][1]=v;
      
    }
    for(int i=0;i<n;i++){
      int u=arr[i][0];
      int v=arr[i][1];
      if(u<=m&&m<=v){
        System.out.print("yes");
        System.exit(0);    
      }
    }
    System.out.print("no");
    
  }
}
