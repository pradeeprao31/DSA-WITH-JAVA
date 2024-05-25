package pradeep;
import java.util.*;
public class hashSet {

	public static void main(String[] args) {
		HashSet<Integer>set=new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(5);
		set.add(2);
		set.add(1);
		
		System.out.println(set);
		
//		if(set.contains(2)) {
//			System.out.println("in the given data 2 is present :");
//		}
		
		set.remove(1);
		System.out.println(set);
		
		
		System.out.print("Size of the set is :: "+set.size());

	}

}
