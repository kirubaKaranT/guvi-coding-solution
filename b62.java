import java.util.*;
import java.util.regex.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
    String s=in.next();
    if(Pattern.matches("[0|1]*",s))
    System.out.println("yes");
    else{
      System.out.println("no");
    }
	}
}
