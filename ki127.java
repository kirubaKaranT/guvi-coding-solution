import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
   
   String[] arr=in.nextLine().split(" ");
  String k=in.next();
   for(int i=0;i<arr.length;i++){
   if(!arr[i].equals(k)){
     System.out.print(arr[i]+" ");
   }
   }
   

    
      
  }
}
