import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    char c=(in.next().charAt(0));

    int fre=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)==c){
        fre++;
      }
    }
    System.out.print(fre);      
  }
 
}
