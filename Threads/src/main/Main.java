package main;

public class Main {

	public static void main(String args[]) {
		
		Server s = new Server();
		s.start();
		
		while(true) {
			
			System.out.println("Main Thread");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}