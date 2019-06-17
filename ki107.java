import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    String arr[]=s.split(" ");
    String n=in.next();
    int c=0;
    for(String kk:arr){
      if(kk.equals(n)){
        c++;
      }
    }
    System.out.print(c);
      
  }
}
