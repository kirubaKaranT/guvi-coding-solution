import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    int m=in.nextInt();
    boolean kk=true;
    
    for(int i=0;i<=m;i++){
      if(!s.contains(i+"")){
        kk=false;
      }
    }
    if(kk)
    System.out.print("yes");
    else
    System.out.print("no");
  }
}
