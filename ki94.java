import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    HashSet<Integer> h=new HashSet<Integer>();
    while(n>0){
    int  rem=n%10;
      if(h.contains(rem)){
        System.out.print("yes");
        System.exit(0);
      }
      else{
        h.add(rem);
      }
      n=n/10;
    }
    System.out.print("no");
  }
}
