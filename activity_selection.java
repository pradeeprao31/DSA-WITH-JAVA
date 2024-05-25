package pradeep;
import java.util.*;
public class activity_selection {

	public static void main(String[] args) {
		int start[]= {1,3,0,5,8,5};
		int end[]= {2,4,6,7,9,9};
		
		
		int macAct=0;
		ArrayList<Integer>ans=new ArrayList<>();
		
		macAct=1;
		ans.add(0);
		int Lastend=end[0];
		for(int i=0; i<end.length; i++) {
			if(start[i]>=Lastend) {
				macAct++;
				ans.add(i);
				Lastend=end[i];
			}
		}
		
		System.out.println("max activity in the list is - : "+ macAct);

		
		for(int i=0 ; i<ans.size(); i++) {
			System.out.print("A"+ans.get(i)+" ");
	
		}
		
		System.out.println();
	}

}
