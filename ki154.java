import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    int k=in.nextInt();
    
    for(int i=0;i<s.length();i++){
    if((i+1)%k==0){
    System.out.print((s.charAt(i)+"").toUpperCase());
    }
    else{
      System.out.print(s.charAt(i));
    }
    }
  
  }
}
