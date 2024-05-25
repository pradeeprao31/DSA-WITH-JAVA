package pradeep;
import java.util.*;

public class Q_U_T0_Stack {
    static class Quere{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2= new Stack<>();
    }

    public static boolean isEmpty() {
        return Quere.s1.isEmpty(); // Accessing s1 from Quere class
    }

    // add 
    public static void add(int data) {
        while(!Quere.s1.isEmpty()) {
            Quere.s2.push(Quere.s1.pop());
        }
        Quere.s1.push(data);
        while(!Quere.s2.isEmpty()) {
            Quere.s1.push(Quere.s2.pop());
        }
    }

    public static void remove() {
        if(isEmpty()) {
            System.out.println("queue empty");
            //return -1; // You cannot return a value from a void method
            return;
        }
        Quere.s1.pop();
    }

    public static int peek() {
        if(isEmpty()) {
            System.out.println("queue empty");
            return -1;
        }
        return Quere.s1.peek();
    }

    public static void main(String[] args) {
        Q_U_T0_Stack q = new Q_U_T0_Stack();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()) {
            System.out.println(q.peek() + " ");
            q.remove(); // Remove elements while printing
        }
    }
}
