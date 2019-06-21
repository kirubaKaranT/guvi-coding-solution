import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
   int[] arr=new int[n];
   for(int i=0;i<n;i++){
    arr[i]=in.nextInt();
   }


    System.out.print(lcm(arr,n));
      
  }
  static int gcd(int a,int b){
    if(b==0){
      return a;
    }
    return gcd(b,a%b);
  } 
  static int lcm(int[] arr,int n){
    int res=arr[0];
    for(int i=1;i<n;i++){
      res=(arr[i]*res)/gcd(arr[i],res);
    }
    return res;
  }
}
