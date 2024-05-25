package pradeep;
import java.util.*;
public class inbuilt_sort {

	
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]= {5,4,1,2,3};
		
		Arrays.sort(arr);
		printArray(arr);
		

	}

}
