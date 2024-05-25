package pradeep;

public class Mythread extends Thread{
	
	public void run() {
	 for(int i=1; i<=10; i++) {
		 System.out.println("run "+ Thread.currentThread().getName());
	 }
	}
	public static void main(String[] args) {
		Mythread  mt= new Mythread();
		mt.setName("pradeep");
		mt.start();
		 for(int i=1; i<=10; i++) {
			 System.out.println("run "+ Thread.currentThread().getName());
		 }

	}

}
