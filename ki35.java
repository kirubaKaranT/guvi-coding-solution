import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    s=s.toLowerCase();
    int[] fre=new int[130];
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)!=' '){
        fre[s.charAt(i)]++;
      }
    }
    int f=1;
    boolean notpr=true;
    while(notpr){
      for(int i=0;i<s.length();i++){
        if(fre[s.charAt(i)]==f){
          notpr=false;
          System.out.print(s.charAt(i)+" ");
        }
      }
      f++;
    }


   // System.out.print();      
  }
 
}
