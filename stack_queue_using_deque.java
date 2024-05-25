package pradeep;
import java.util.*;
public class stack_queue_using_deque {
	
	static class Stack {
		Deque<Integer> deque=new LinkedList<>();
		
		public void push(int data) {
			deque.addLast(data);	
		}
		
		public int pop() {
			return deque.removeFirst();
		}
		
		public int peek() {
			return deque.getFirst();
		}
		
	}	
		// QUEUE 
		
	static class Queue {
			Deque<Integer> deque=new LinkedList<>();
			
			public void add(int data) {
				deque.addLast(data);	
			}
			
			public int remove() {
				return deque.removeLast();
			}
			
			public int peek() {
				return deque.getLast();
			}
		
	}

	   public static void main(String args[]) {
		
		//Stack s= new Stack();
	   //s.push(1);
	   //s.push(2);
	   //s.push(3);
	   
	   //System.out.println("peek = "+s.peek());
	   //System.out.print(s.pop()+" ");
	   //System.out.print(s.pop()+" ");
	   //System.out.print(s.pop()+" ");
	   
		Queue q = new Queue();
		
		q.add(1);
		q.add(2);
		q.add(3);
		
		System.out.println("peek ="+ q.peek());
		System.out.print(q.remove());
		System.out.print(q.remove());
		System.out.print(q.remove());
	
	}
	}
	
	
