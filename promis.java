import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int t=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    ArrayList<Integer> list=new ArrayList<Integer>();
    while(t-->0){
      int l=in.nextInt();
      int r=in.nextInt();

     int max=arr[l-1];      
      for(int i=l-1;i<r;i++){
          max=Math.max(arr[i],max);
      }
      for(int i=max;i>=1;i--){
        int c=0;
        for(int j=l-1;j<r;j++){
          if(arr[j]%i==0){
            c++;
          }
        }
       // System.out.println("c="+c+"\nl-r="+(r-l));
        if(c==(r-l+1)){
          list.add(i);
          break;
        }
      }
    }
    for(Integer i:list)
    System.out.println(i);
      
  }
}
