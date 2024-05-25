package pradeep;
import java.util.*;
public class maxSubArray_Sum {
	
	public static void Maxsubarray(int num[]) {
		int cursum =0;
		int maxsum=Integer.MIN_VALUE;
		
		for(int i=0; i<num.length; i++) {
			int start =i;
			for(int j=0; j<num.length; j++) {
				int end =j;
				cursum=0;
				for(int k=start; k<=end; k++) {
					cursum +=num[k];
				}
				
				System.out.println(cursum);
				if(maxsum<cursum) {
					maxsum=cursum;
				}
			}
			
		}
		
		
		System.out.println("maxim"+maxsum) ;
	}
	
	

	public static void main(String[] args) {
		
		int num[]= {1,-2,6,-1,3};
		
		Maxsubarray(num);
	}

}
