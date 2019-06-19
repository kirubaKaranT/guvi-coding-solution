import java.util.*;


public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    int max=Math.max(n,m);
    for(int i=max;i<=(n*m);i++){
      if(i%n==0&&i%m==0){
        System.out.print(i);
        System.exit(0);
      }
    }
  }
  
}
