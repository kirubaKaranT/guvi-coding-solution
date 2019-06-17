import java.util.*;

public class Main {
  static TreeSet<Integer> lis=new TreeSet<Integer>();
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    find(arr,k,0);
    //Collections.sort(lis);
    for(Integer i:lis){
      
      System.out.print((i)+" ");
      
    }

  }
  public static void find(int[] arr,int k,int w){
    if(k==0){
      lis.add(w);
    }
    else{
      for(int i=0;i<arr.length;i++){
        find(arr,k-1,w+arr[i]);
      }
    }
  }

}
