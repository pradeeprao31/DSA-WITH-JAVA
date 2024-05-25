package pradeep;
import java.util.*;
public class duplicates_elements {
	public static void main(String args[]) {
		String names[]= {"java","c","python","java","c++","c"};
		
		//for(int i=0; i<=name.length; i++) {
		//	for(int j=i+1; j<=name.length; j++) {
			//	if(name[i].equals(name[j])) {
				//	System.out.println("duplicat element is :-"+name[i]);
			//	}
			//}
		//		
		//}
		
		
		Set<String>Store=new HashSet<String>();
		for(String name:names) {
			if(Store.add(name)==false) {
				System.out.println("duplicate is:-"+name);
			}
		}
	}

}
