import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int pow=(int)(Math.log(n)/Math.log(2));  
    if(Math.pow(2,pow)==n){
      System.out.print("yes");
    }
    else{
      System.out.print("no");
    }
  }
}
