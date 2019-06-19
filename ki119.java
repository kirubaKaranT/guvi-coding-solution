import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String n=in.next();
    int res=0;
    int base=1;
    for(int i=n.length()-1;i>=0;i--){
      res+=find(n.charAt(i),base);
      base*=16;
    }


  System.out.print(res);      
  }
  static int find(char c,int base){
    if(c=='A'){
      return 10*base;
    }
    else if(c=='B'){
      return 11*base;
    }
    else if(c=='C'){
      return 12*base;
    }
    else if(c=='D'){
      return 13*base;
    }
    else if(c=='E'){
      return 14*base;
    }
    else if(c=='F'){
      return 15*base;
    }
    return Integer.valueOf(c+"")*base;

  }
}
