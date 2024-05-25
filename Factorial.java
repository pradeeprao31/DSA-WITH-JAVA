package pradeep;

import java.util.*;
public class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int x = sc.nextInt();
		int y = 1;
		for(int i= 1; i<=x; i++) {
			y = y*i;
		}
		System.out.println("Factorial:"+y);
	}
}