package pradeep;

import java.util.*;
public class StringPalindrom2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String y = "";
		for(int i=x.length()-1;i>=0;i--) {
			y = y + x.charAt(i);
		}
		if(x.equals(y)) {
			System.out.println("String is palindrom:"+y);
		}
		else {
			System.out.println("String is not palindrom:"+y);
		}
	}
}