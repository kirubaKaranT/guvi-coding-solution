import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    int c=0;
    char a=s.charAt(0);
    int[] arr=new int[500]; 
  for(int i=0;i<s.length();i++){
    arr[s.charAt(i)]++;
    
    if(arr[s.charAt(i)]>c){
      
      c=arr[i];
      a=s.charAt(i);
    
    }
  }
    System.out.print(a);
      
  }
}
