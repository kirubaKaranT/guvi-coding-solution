import java.util.*;
import java.util.regex.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    String[] arr=s.split(" ");
    int[] arr1=new int[arr.length];
    for(int i=0;i<arr.length;i++){
      arr1[i]=Integer.valueOf(arr[i]);
    }
    int min=Integer.MAX_VALUE;
    for(int i=0;i<arr1.length;i++){
      min=Math.min(min,arr1[i]);
    }
      System.out.println(min);
    
	}
}
