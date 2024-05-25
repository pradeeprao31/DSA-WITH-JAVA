package pradeep;
import java.util.*;
import java.util.Arrays;

public class largest_smallest_no_in_araay {

	public static void main(String[] args) {
		int arr[]= {10,23,45,897,6559,2,987,34};
		
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			else if(arr[i]<smallest) {
				smallest=arr[i];
			
		}
		}	
		//System.out.println("given array is : "+Arrays.toString(arr));
		System.out.println("this is largest no: "+largest);
		
		System.out.print("this is smallest no :"+ smallest);

	}

}
