package pradeep;
import java.util.*;
public class Array {
	
	
	
	
	public static void update(int mark[]) {
		for(int i=0; i<=mark.length; i++) {
			mark[i]=mark[i]+1;
			System.out.print(mark[i] +" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
//		int mark[]=new int[30];
//		
//		Scanner sc =new Scanner(System.in);
//		
//		mark[0]=sc.nextInt();
//		mark[1]=sc.nextInt();
//		mark[2]=sc.nextInt();
//		
//		
//		System.out.println("math  " +  mark[0]);
//		System.out.println("Hindi  " +mark[1]);
//		System.out.println("English  " +mark[2]);
//		
//		
//		int precentage=(mark[0]+mark[1]+mark[2])/3;
//		
//		System.out.print("present = "+precentage+ " %");
		
		
		
		int mark[]= {97,98,99};
		update(mark);
		

	}

}
