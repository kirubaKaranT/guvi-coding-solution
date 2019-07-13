import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    int count=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='0'){
        count++;
      }
    }
    if(count>=5)
    System.out.print("yes");
    else{
      System.out.print("no");
    }
      
  }
}
