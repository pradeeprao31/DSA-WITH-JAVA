package pradeep;
import java.util.*;
public class Deque_in_java {

	public static void main(String[] args) {
		Deque<Integer> deque=new LinkedList<>();
		deque.addFirst(1);
		deque.addLast(2);
		
		System.out.println("old"+deque);
		
		deque.removeLast();
		System.out.print("new"+deque);
	}

}
