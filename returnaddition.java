package pradeep;
import java.util.*;
public class returnaddition {
	public static int add(int x,int y) {
	 return x+y;
		
	}
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the first number ");
		int a=sc.nextInt();
		System.out.print("Enter the second number ");
		int b=sc.nextInt();
		
		
		System.out.print("addition of two number is : " +add(a,b) );
	}
		
	

}
