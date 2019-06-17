import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    Arrays.sort(arr);
    if(n==2||n==1)
    System.out.print(arr[n-1]);
    else if(n==3){  
      System.out.print(2*arr[n-1]);
    }
    else{
      int c=1;
      
      c+=(n-3)/2;
      int rem=(n-3)%2;
      int sum=0;
      n-=1;
      while(c-->0){
        sum+=(2*arr[n--]);
      }
      if(rem==1)
      sum+=arr[n];
      System.out.print(sum);
    }
      
  }
}
