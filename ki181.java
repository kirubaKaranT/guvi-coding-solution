import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
   if(n%3==0||n%7==0||(n%7)%3==0)
    System.out.print("yes");
    else
    System.out.print("no");
    
  }
}
