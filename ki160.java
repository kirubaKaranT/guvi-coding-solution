import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int  n=in.nextInt();
    int k=in.nextInt();
    n+=k;
    int c=0;
    while(n>0){
      
      if((n&1)==1){
        
       c++;
             
      }
      n/=2;
     
    }
  System.out.print(c);
  }
}
