import java.util.*;


public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
   int l=in.nextInt();
   int r=in.nextInt();
   int c=0;
    for(int i=l;i<=r;i++){
      if(i==Math.pow(Math.sqrt(i),2)){
       c++;
      }
      
    }
     System.out.print(c);
  }
  
}
