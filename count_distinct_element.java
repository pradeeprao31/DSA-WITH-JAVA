package pradeep;
import java.util.*;
public class count_distinct_element {

	public static void main(String[] args) {
		
		int num[]= {4,3,2,5,6,7,3,4,2,1};
		
		HashSet<Integer>Hs=new HashSet<>();
		
		for(int i=0; i<num.length; i++) {
			Hs.add(num[i]);
			
		}
		
		System.out.print(Hs.size());

	}

}
