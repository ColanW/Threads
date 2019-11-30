package main;

public class Server extends Thread{

	public void run() {
		
		while(true) {
			
			System.out.println("Server Thread");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}