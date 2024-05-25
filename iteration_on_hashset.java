package pradeep;
import java.util.*;
public class iteration_on_hashset {

	public static void main(String[] args) {
		
		HashSet<String> cities= new HashSet<>();
		cities.add("patna");
		cities.add("puna");
		cities.add("mumbi");
		cities.add("delhi");
		cities.add("bettiah");
		
//		Iterator is = cities.iterator();
//		while(is.hasNext()) {
//			System.out.println(is.next());
//		}
		
		
		for(String citie :cities) {
			System.out.println(citie);
		}
	}

}
