package pradeep;
import java.util.*;
public class StringEvenodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x=sc.next();
		int y=x.length();
		if( y%2==0) {
			System.out.print("the given String is even");
		}
		else {
			System.out.print("The given number is odd");
		}
	}

}
