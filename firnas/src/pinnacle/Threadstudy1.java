package pinnacle;

public class Threadstudy1 {
   public static void main(String[] args) {
	Thread t= Thread.currentThread();
	System.out.println("the thread name is.."+t.getName());
	//changing thread name
	t.setName("main thread");
	System.out.println("thread name after changing....."+t.getName());
	try {
		int a=10;
	    Thread.sleep(1000);
	    System.out.println("the value of a is="+a);
		for(int i=1;i<=5;i++) {
			
			Thread.sleep(1000);
			System.out.println(" iteration -"+i+" after sleep 1000 ");
		}
	}
	catch(InterruptedException e){
		System.out.println("try thread in sleep");
	}
}
}
