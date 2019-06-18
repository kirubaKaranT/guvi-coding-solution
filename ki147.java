import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    String[] arr=s.split(" ");
    for(int i=0;i<arr.length;i++){
    if(i==0)
    System.out.print(arr[i]+" ");
    else if(i==arr.length-1){
      System.out.print(arr[i]);
    }  
    else{
      StringBuilder k=new StringBuilder(arr[i]);
      System.out.print(k.reverse()+" ");
    }
    }
    
    
  }
  
}
