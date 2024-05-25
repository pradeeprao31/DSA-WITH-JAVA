package pradeep;

public class remove_juck_form_string {

	public static void main(String[] args) {
		String s= "@#$%&*@ pradeep kumar rao 7763938412";
		
		// regular Expression
		
		s=s.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(s);

	}

}
