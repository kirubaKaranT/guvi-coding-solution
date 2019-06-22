import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=3;
    int[] arr=new int[3];
    for(int i=0;i<3;i++){
      arr[i]=in.nextInt();
    }
    Arrays.sort(arr);
    if(Math.pow(arr[0],2)+Math.pow(arr[1],2)==Math.pow(arr[2],2)){
      System.out.print("yes");
    }
    else{
      System.out.print("no");
    }
  }
}
