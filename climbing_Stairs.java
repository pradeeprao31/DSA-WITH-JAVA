package pradeep;
import java.util.*;
public class climbing_Stairs {
	public static int CountWays(int n,int ways[]) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		if(ways[n] !=-1) {
			return ways[n];
		}
		
		ways[n]= CountWays(n-1,ways)+CountWays(n-2,ways)+CountWays(n-3,ways); 
		return ways[n];
	}

	public static void main(String[] args) {
		int n=3;
       int ways[]=new int[n+1];
		Arrays.fill(ways, -1);
		 
		
		System.out.print(CountWays(n,ways));
	}

}
