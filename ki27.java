import java.util.*;


public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    String up=s.toUpperCase();
    String lo=s.toLowerCase();

    for(int i=0;i<s.length();i++){
      if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
        System.out.print(up.charAt(i));
      }
      else{
        System.out.print(lo.charAt(i));
      }
    }
  }
  
}
