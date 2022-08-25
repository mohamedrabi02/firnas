package pinnacle;

public class Threadstudy1 {
   public static void main(String[] args) {
	Thread t= Thread.currentThread();
	//new newthread2();
	System.out.println("the thread name is.."+t.getName());
	//changing thread name
	t.setName("main thread");
	System.out.println("thread name after changing....."+t.getName());
	new newthread2();
	try {
		
		/*
		  if the sleep time of the try method is interrupted by any other 
		  thread, the catch method will be called..
		  cause the catch method is of interrupted exception . 
		 */
		
		for(int i=1;i<=5;i++) {
			
			Thread.sleep(100);
			System.out.println(" aiteration -"+i+" after sleep 100 ");
		}
	}
	catch(InterruptedException e){
		System.out.println("try 1 thread interrupted......");
		//new newthread2();
	}
}
}
class newthread2 implements Runnable{
	Thread a;
	newthread2(){
		a= new Thread(this,"newthread2");
		System.out.println("2 thread");
		a.start();
	}
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				
				//Thread.sleep(100);
				System.out.println(" biteration -"+i+" after sleep 100 ");
				Thread.sleep(100);
			}			
			
		}
		catch(InterruptedException e) {
			System.out.println("try 2 interrupted....");
		}
	}
}
