import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String  s=in.next();
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      c+=3;
      if(c>'Z'){
        int rem=c-'Z';
        rem-=1;
        c=(char)('A'+rem);
      }
      System.out.print(c);

    }
  
  }
  
}
