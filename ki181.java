import java.util.*;

public class Main {
  static boolean[] arr;
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
   
    
    
   if(find( n))
    System.out.print("yes");
    else
    System.out.print("no");
    
  }
  public static boolean find(int n){
    if(n==0){
      return true;
    }
    else if(n<0){
      return false;
    }
    else{
      return find(n-3)||find(n-7);
    }
  }
}
