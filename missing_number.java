package pradeep;
import java.util.*;
public class missing_number {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,5,6,7,8,9};
		int sum=0; 
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
		
		int sum1=0;
		for(int j=0; j<=9; j++) {
			sum1=sum1+j;
		}
		
		System.out.println(sum1);
		
		
		System.out.println("Missing Number is :- "+ (sum1-sum));

	}

}
