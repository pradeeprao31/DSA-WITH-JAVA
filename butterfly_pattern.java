package pradeep;

public class butterfly_pattern {
	
	public static void butp(int n) {
		
		
		// first half part 
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			
			// for space 
			for(int j=1; j<=2*(n-i); j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// second half part 
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			for(int j=1; j<=2*(n-i); j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
	
	

	public static void main(String[] args) {
		
		butp(4);
		

	}

}
