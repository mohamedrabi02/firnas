package pinnacle;

public class Threadstudy2 { //creating thread extending thread class
	public static void main(String[] args) {
		new newthread();
		try {
			for(int i = 5; i > 0; i--) {
			  System.out.println("Main Thread: " + i);
			  Thread.sleep(1000);
			 }
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		
	}

}
class newthread extends Thread{
	newthread(){
		System.out.println("starting 2nd thread");
		start();
	}
	public void run() {
		try {
			for(int i=0;i<6;i++) {
				System.out.println("child thread iteration "+i);
				Thread.sleep(1000);
				
			}
		}
		catch(InterruptedException e) {
			System.out.println("child thread interrupted..");
		}
		System.out.println("exiting child class...");
	}
}