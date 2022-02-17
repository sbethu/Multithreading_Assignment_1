package Assignment2;

public class WithSyncBlock extends Thread{
	public static void main(String[] args) {		
		WithSyncBlock thread0 = new WithSyncBlock();	
		WithSyncBlock thread1 = new WithSyncBlock();
		thread0.start();
		thread1.start();

	}
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( Thread.currentThread().getName() +" in "+ Thread.currentThread().getState());
		//SyncBlock sync = new SyncBlock();
		SyncBlock.res();
	}
}

class SyncBlock{
	public static void res() {
		System.out.println("Outside Syncronized block "+ Thread.currentThread().getName() +" in "+ Thread.currentThread().getState());
		
		synchronized(SyncBlock.class){
		for(int i=0; i<5; i++) { 
			System.out.println("Resource is being used "+i+" times, by "+ Thread.currentThread().getName());
		}
		}
	}
}

