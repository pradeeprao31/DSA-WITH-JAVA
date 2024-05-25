package pradeep;
import java.util.*;
public class fib {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int feb=sc.nextInt();
		int a=0,b=1,c;
		for(int i=0; i<feb; i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		
		

	}

}
