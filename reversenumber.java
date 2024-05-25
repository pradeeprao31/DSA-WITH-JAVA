package pradeep;
import java.util.*;
import java.util.*;

public class reversenumber {
    
    public static void rev(int n) {
        while (n > 0) {
            int r = n % 10;
            System.out.print(r);
            n = n / 10;
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Number: ");
       int n = sc.nextInt();
       
       rev(n);

      System.out.println();  
    	
    	// using the Sting Buffer method
    	long num=32645;
    	
    	System.out.print(new StringBuffer(String.valueOf(num)).reverse());
    }
}
