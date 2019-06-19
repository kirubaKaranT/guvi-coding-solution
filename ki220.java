import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    String res="";
    if(n==0){
      System.out.print(1);
      System.exit(0);
    }
    while(n>0){
      if(n%2==1){
        res+="1";
      }
      else{
        res+="0";
      }
      n=n>>1;

    }
    


  System.out.print(res.length());      
  }
 
}
