package pradeep;

import java.util.*;
public class SmallSentence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String y = "";
		
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)>64 && x.charAt(i)<91) {
				y = y + (char)(x.charAt(i)+32);
			}
			else if(x.charAt(i)==' ') {
				y = y + ' ';
			}
		}
		System.out.println(y);


	}
}