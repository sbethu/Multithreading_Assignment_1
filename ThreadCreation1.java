// Shows the creation of thread by extending "Thread Class"
// Also displays the life cycle of the thread NEW, RUNABLE, TIMES_WAITING, TERMINATED

package Assignment;

public class ThreadCreation1 extends Thread{
	
	public static void main(String args[]) throws InterruptedException{
		
		System.out.println(Thread.currentThread().getName() + " is in " + Thread.currentThread().getState() + " stage");

		ThreadCreation1 thread = new ThreadCreation1();
		ThreadCreation1 thread1 = new ThreadCreation1();

		System.out.println(thread.getName() + " is in "+ thread.getState()+ " stage");
		System.out.println(thread1.getName() + " is in " + thread1.getState()+ " stage");

		thread.start();
		Thread.sleep(1000);
		thread1.start();
		System.out.println(thread.getName() + " is in " + thread.getState()+ " stage");
		System.out.println(thread1.getName() + " is in " + thread1.getState()+ " stage");

        thread.join();
        thread1.join();
		System.out.println(thread.getName() + " is in " + thread.getState()+ " stage");
		System.out.println(thread1.getName() + " is in " + thread1.getState()+ " stage");

	}
	
	public void run(){ 
		System.out.println(Thread.currentThread().getName() + " here is in "+ Thread.currentThread().getState()+ " stage");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}