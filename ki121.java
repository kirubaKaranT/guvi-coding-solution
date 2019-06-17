import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    String[] arr=new String[n];
    for(int i=0;i<n;i++){
      arr[i]=in.next();
    }
    String min=arr[0];
    for(int i=1;i<n;i++){
      min=cmp(min,arr[i]);
    }
    System.out.print(min);
  
  }
  public static String cmp(String a,String b){
    int n=Math.min(a.length(),b.length());
    int i=0;
    while(i<n){
      if(a.charAt(i)<b.charAt(i)){
        return a;
      }
      else if(a.charAt(i)>b.charAt(i)){
        return b;
      }
      i++;
    }
    if(i==a.length()){
      return a;
    }
    else{
      return b;
    }
  }
}
