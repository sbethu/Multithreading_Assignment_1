package Assignment2;

public class WithSyncMethod implements Runnable{
	public static void main(String[] args) {
		Thread thread0 = new Thread(new WithSyncMethod());
		thread0.start();	
		Thread thread1 = new Thread(new WithSyncMethod());
		thread1.start();
		Thread thread2 = new Thread(new WithSyncMethod());
		thread2.start();
	}
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( Thread.currentThread().getName() +" in "+ Thread.currentThread().getState());
		SyncMethod.res();
	}

}

class SyncMethod{
	synchronized static void res() {
		for(int i=0; i<5; i++) 
			System.out.println("Resource is being used "+i+" times, by "+ Thread.currentThread().getName());
	}
}

