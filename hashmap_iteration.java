package pradeep;
import java.util.*;
public class hashmap_iteration {

	public static void main(String[] args) {
		HashMap<String ,Integer>hm=new HashMap<>();
		hm.put("India",100);
		hm.put("napal", 5);
		hm.put("usa", 65);
		hm.put("pakistan", 10);
		hm.put("indonisa", 7);
		hm.put("canada", 8);
		
		
		
		/// iteration
		
		
		Set<String>kays=hm.keySet();
		
		System.out.println(kays);
		
		for(String k : kays) {
			
		System.out.println("key "+k+" "+"valuse"+hm.get(k));
		
		}
	}

}
