package pradeep;
import java.util.*;
public class hash_map {

	public static void main(String[] args) {
		HashMap<String ,Integer>hm= new HashMap<>();
		hm.put("India",100);
		hm.put("napal", 5);
		hm.put("usa", 65);
		
		System.out.println(hm);
		
		
		
		// get  - o(1)
		
		int population = hm.get("India");
		//System.out.println(population);
		
		//System.out.println(hm.get("pakistan"));
		
		// ContainsKey -o(1)
		
		
		//System.out.println(hm.containsKey("usa"));
	//	System.out.println(hm.containsKey("ruass"));
		
		//
		
		
		
		
		// remove 
		
		System.out.println(hm.remove("usa"));
		
		System.out.println(hm);
		
		// size()
		
		System.out.println(hm.size());
		
		// 
		hm.clear();
		System.out.println(hm.isEmpty());
		
		System.out.println(hm+"Data is not present in the database");

	}

}
