package Assignment2;

public class WithoutSync implements Runnable{
	public static void main(String[] args) {
		Thread thread0 = new Thread(new WithoutSync());
		thread0.start();	
		Thread thread1 = new Thread(new WithoutSync());
		thread1.start();
	}
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Resource.res();
	}

}

class Resource{
	//Resource res = new Resource();
	public static void res() {
		for(int i=0; i<5; i++) 
			System.out.println("Resource is being used "+i+" times, by "+ Thread.currentThread().getName());
	}
}
