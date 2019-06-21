import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
   
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
 boolean odd=true;
   for(int i=0;i<n;i++){
    if(arr[i]%2==0){
      odd=false;
    }
   }

  if(!odd){
    System.out.print("even");
  }
  else{
    System.out.print("odd");
  }
  }
}
