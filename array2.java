package pradeep;
import java.util.*;
public class array2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the array size :-");
		int size=sc.nextInt();
		int a[]= new int [size];
		
		for(int i=0; i<size; i++) {
			  a[i]=sc.nextInt();
		}
		System.out.print("Array is printed ");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
