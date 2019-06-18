import java.util.*;

public class Main {
  static boolean[] arr;
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }   
    Arrays.sort(arr);
    int c=1;
    for(int i=1;i<n;i++){
        if(arr[i]==arr[i-1]){
            c++;
        }
    }
    
  

    System.out.print(c);
    
  }

}
