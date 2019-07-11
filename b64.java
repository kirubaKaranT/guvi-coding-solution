import java.util.*;
import java.util.regex.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    a+=in.nextInt();
    if((a&1)==1)
      System.out.print("odd");
      else
      System.out.print("even");
    
	}
}
