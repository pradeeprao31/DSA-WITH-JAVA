package pradeep;
import java.util.*;
public class largest_value_arrray {
	
	public static int getLargest(int num[]) {
		int largest=Integer.MIN_VALUE;
		int smallest =Integer.MAX_VALUE;
		for(int i=0; i<num.length; i++) {
			
			if(largest<num[i]) {
				largest=num[i];
			}
			if(smallest>num[i]) {
				smallest=num[i];
			}
			
		}
		
		System.out.println("smalllest number is "+smallest);
		return largest;
	}

	public static void main(String[] args) {
		
		
		int num[]= {1,2,6,9,7,5,654,65498,3215};
		
		System.out.print("largest number is "+getLargest(num));
		
		

	}

}
