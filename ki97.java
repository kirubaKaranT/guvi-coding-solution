import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    int s=0;
    
    for(int i=n;i<=m;i++){
      if(i%2==1){
        s+=i;
      }
    }
    System.out.print(s);
  }
}
