import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int  n=in.nextInt();
    int k=in.nextInt();
    n*=k;
    int c=1;
    while(n>0){
      
      if((n&1)==1){
        System.out.print(c);
        System.exit(0);
             
      }
      n/=2;
     c*=2;
    }
  
  }
}
