package pradeep;
import java.util.*;
public class Stringreverse {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String x = sc.next();
		String y = "";
//		for(int i=x.length()-1;i>=0;i--) {
//			y = y + x.charAt(i);
//		}
//		System.out.println("Reverse String is:"+y);
		
		
		StringBuffer sf=new StringBuffer(x);
		System.out.print(sf.reverse());
		
	}


}
