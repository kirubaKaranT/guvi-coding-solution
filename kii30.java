import java.util.*;


public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
   String a=in.next();
   String b=in.next();
int k=in.nextInt();
   int c=0;
    for(int i=0;i<a.length();i++){
      if(a.charAt(i)!=b.charAt(i)){
       c++;
      }
      
    }
      if(k==c)
     System.out.print("yes");
     else{
       System.out.print("no");
     }
  }
  
}
