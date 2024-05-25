package pradeep;
import java.util.*;
public class find_the_length_of_array {

	public static void main(String[] args) {
		//int a[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the array size :- ");
		int size=sc.nextInt();
		System.out.println("enter the element");
		int a[]= new int [size];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
			}
		System.out.println("array element");
		for(int i=0 ; i<a.length; i++) {
			System.out.println( a[i]);
		}
		
		System.out.println("length of array is :-"+a.length);
		
	}

}
