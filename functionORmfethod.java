package pradeep;
import java.util.*;
public class functionORmfethod {
	
	public static void addsum() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=sc.nextInt();
		
		int c=a+b;
		
		System.out.print(c);
	}
	
	
	
	public static void swap(int a, int b) {
		
		int temp =a;
		a=b;
		b=temp;
		
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
	
	

	
	public static int product(int a, int b) {
		int c=a* b;
		
		//System.out.print(c);
		
		return c;
		
	}

	
	public static int factorial(int n) {
		int f=1;
		for(int i=1; i<=n ; i++) {
			f=f*i;
		}
		return f;
	}
	
	
	
	public static int bion(int n, int r) {
		int fact_n=factorial(n);
		int fact_r=factorial(r);
		int fact_nrm= factorial(n-r);
		
		int bion=fact_n/(fact_r*fact_nrm);
		return bion;
	}
	
	
	public static int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	
	public static int sum(int a ,int b, int c) {
		int d=a+b+c;
		return d;
	}
	
	
	public static int sum1(int a, int b) {
		return a+b;
	}
	
	public static float sum1(float a, float b) {
		return a+b;
	}
	
	
	
	
	public static boolean isprime(int n) {
		for(int i=2; i<Math.sqrt(n); i++) {
			
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	public static void primeInrange(int n) {
		
		for(int i=2; i<=n; i++) {
			if(isprime(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		
		
		
	}
	
	
	
	
	public static void binTodec(int binNum) {
		int pow =0; 
		int decNum=0;
		
		while(binNum>0) {
			int ld=binNum%10;
			decNum=decNum+ (ld*(int)Math.pow(2, pow));
			
			pow++;
			binNum= binNum/10;
		}
		
		
		System.out.print("Decmial of "+binNum+" = "+decNum);
	}
	
	
	
	public static void decTobin(int n) {
		int pow=0;
		int binNum=0;
		int Mynum=n;
		while(n>0) {
			int rem=n%2;
			binNum=binNum+(rem*(int)Math.pow(10,pow));
			pow++;
			n=n/2;
		}
		System.out.print("Decmial to "+Mynum+"binary is "+ binNum);
	}
	
	
	
	
	public static void main(String[] args) {
		
		//addsum();
		
		
		int a=10;
		int b= 50;
		
		
//		int temp =a;
//		a=b;
//		b=temp;
//		
//		System.out.println(a);
//		System.out.println(b);
//		
		//swap(a,b);
		
		
//		int mulp= product(a,b);
//		System.out.println(a+" product of"+b +mulp);
//		
		
		
		//System.out.print(factorial(4));
		
		
		//System.out.print(bion(5,2));
		
		
		
//		System.out.println(sum(4,5));
//		
//		System.out.print(sum(4,5,6));
//		
		
		
//		System.out.println(sum1(4,5));
//		System.out.println(sum1(4.46f,5.46f));
		
		
		
		//System.out.println(isprime(45));
		
		
		//primeInrange(100);

		//binTodec(101);
		
		
		decTobin(13);
		
		
	}

}
