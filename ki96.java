import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    String s=n+"";
    System.out.print(Integer.valueOf(s.charAt(s.length()-1)+"")+Integer.valueOf(s.charAt(0)+""));
  }
}
