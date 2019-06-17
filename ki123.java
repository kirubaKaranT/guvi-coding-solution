import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for(int i=2;i<n;i++){
      if(isprime(i)&&n%i==0){
        System.out.print(i+" ");
      }
    }

  }
  static boolean isprime(int n){
	   boolean prime=true;
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            prime=false;
        }
    }
  
    return prime;
	}
}
