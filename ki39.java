import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
   
   if(n==Math.pow(2,(int)(Math.log(n)/Math.log(2))))
   System.out.print("yes");          
    else{
      System.out.print("no");          
    }
  }
 
}
