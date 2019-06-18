import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
   

    System.out.print(f(n)/f(m));
    
  }
  public static int f(int n){
    if(n==0||n==1){
      return 1;
    }
    return n*f(n-1);
  }

}
