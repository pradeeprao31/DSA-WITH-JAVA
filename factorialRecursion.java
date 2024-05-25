package pradeep;
import java.util.*;

public class factorialRecursion {

    public static int fact(int x) {
        if (x == 0)
            return 1;
        else
            return x * fact(x - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println("Factorial of Recursion: " + fact(x));
    }
}
