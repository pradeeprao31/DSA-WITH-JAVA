package pradeep;

import java.util.*;
public class StringEven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		int y = x.length();
		if(y%2==0) {
			System.out.println("Even String:"+x);
		}
		else {
			System.out.println("Odd String:"+x);
		}
	}
}