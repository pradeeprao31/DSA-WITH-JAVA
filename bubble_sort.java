package pradeep;
import java.util.*;
public class bubble_sort {
	
	public static void Bubble(int arr[]) {
		for(int i=0; i<=arr.length-2; i++) {
			for(int j=0; j<=arr.length-2-i; j++) {
				if(arr[j]<arr[j+1]) {  /// for increasing order  if(arr[j]>arr[j+1])
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					
				}
				
			}
			
		}
	}
	
	
	public static void printArr(int arr[]) {
		
		for(int i =0; i<arr.length; i++) {
			System.out.print("" + arr[i] +" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		int arr[]= {5,4,1,3,2};
		
		Bubble(arr);
		printArr(arr);
	}

}
