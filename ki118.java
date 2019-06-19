import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String[] arr=in.nextLine().split(" ");
    int max=arr[0].length();
    String result=arr[0];
    for(int i=0;i<arr.length;i++){
      if(max<arr[i].length()){
        max=arr[i].length();
        result=arr[i];
      }
    }

    System.out.print(result);
    

      
  }
}
