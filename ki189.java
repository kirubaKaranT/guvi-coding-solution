import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=3;
    int[] arr=new int[3];
    for(int i=0;i<3;i++){
      arr[i]=in.nextInt();
    }
    
    if(arr[0]!=arr[1]&&arr[0]!=arr[2]&&arr[1]!=arr[2]){
      System.out.print("yes");
    }
    else{
      System.out.print("no");
    }
  }
}
