import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int pos=Math.min(n,k);
    for(int i=k;i>=1;i--){
      if(n%i==0&&k%i==0){
        System.out.print(i);
        break;
      }
    }
    
      
  }
}
