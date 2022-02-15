// Displays the join() usage
package Assignment;

public class JoinExample extends Thread {

	public static void main(String args[]) throws InterruptedException{
		
		System.out.println(Thread.currentThread().getName() + " is in " + Thread.currentThread().getState() + " stage");

		JoinExample thread1 = new JoinExample();
		JoinExample thread2 = new JoinExample();
		JoinExample thread3 = new JoinExample();
		JoinExample thread4 = new JoinExample();
		JoinExample thread5 = new JoinExample();
		JoinExample thread6 = new JoinExample();

		Thread.sleep(1000);
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		thread3.start();
		thread3.join();
		thread4.start();
		thread4.join();
		thread5.start();
		thread5.join();
		thread6.start();
		thread6.join();
		/*
        System.out.println(thread1.getName() + " is in " + thread1.getState()+ " stage");
		System.out.println(thread2.getName() + " is in " + thread2.getState()+ " stage");
		System.out.println(thread3.getName() + " is in "+ thread3.getState()+ " stage");
		System.out.println(thread4.getName() + " is in " + thread4.getState()+ " stage");
		System.out.println(thread5.getName() + " is in " + thread5.getState()+ " stage");
		System.out.println(thread6.getName() + " is in " + thread6.getState()+ " stage");
		 */
	}
	
	public void run(){ 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " is in "+ Thread.currentThread().getState()+ " stage");
	}
}