package pradeep;
import java.util.*;
public class array_reverse_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array :- ");
		int size= sc.nextInt();
		System.out.println("Enter the element of array:- ");
		int a[]=new int[size];
		
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("Array elament :- ");
		for(int i=0 ; i<a.length; i++) {
			System.out.println(a[i]+ " ");
		}
		
		System.out.println("Reverse element of array is :- ");
		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}

	}

}
