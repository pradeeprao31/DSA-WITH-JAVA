package pradeep;
import java.util.*;
public class isprime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
//		if(n==2) {
//			System.out.println("the given no is prime ");
//			
//		} 
//		else {
//			boolean isPrime=true;
//			for(int i=2; i<=n-1; i++) {
//				if(n%i==0) {
//					isPrime=false;
//				}
//			}
//			
//			if(isPrime==true) {
//				System.out.println("the given no is prime number ");
//			}
//			else {
//				System.out.print("the given number is not prime");
//			}
//		}
//		
		for(int i=1; i<=n; i++) {
			int count =0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count ==2) {
				System.out.print( " " +i );
			}
		}
		
		
	}

}
