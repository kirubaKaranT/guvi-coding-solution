import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String a=in.nextLine();
    String b=in.nextLine();
    int i=0,j=0;
   if(a.length()!=b.length()){ 
    while(i<a.length()&&j<b.length()){
      if(a.charAt(i)==b.charAt(j)){
        i++;
        j++;
      }
      else{
        System.out.print(a.charAt(i));
        i++;
      }

    }
   }
   else{
     while(i<a.length()&&j<b.length()){
      if(a.charAt(i)==b.charAt(j)){
        i++;
        j++;
      }
      else{
        System.out.print(a.charAt(i)+" "+b.charAt(j));
        i++;
        j++;
      }

    }
   }
      
  }
}
