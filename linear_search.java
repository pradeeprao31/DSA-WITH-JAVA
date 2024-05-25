package pradeep;

public class linear_search {
	
	
	public static int  LinearSerach(int number[],int key) {
		for(int i=0; i<=number.length; i++) {
			if(number[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int numbers[]= {2,4,6,8,10,12,14,16};
		int key=10;
		
		int index=LinearSerach(numbers,key);
		
		
		
		if(index==-1) {
			System.out.print("element is not foind ");
		}
		else {
			System.out.print("element is foind "+ index);
		}
		
		

	}

}
