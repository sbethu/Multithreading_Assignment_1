// Shows the creation of thread by implementing "Runnable Interface"
// Also displays the life cycle of the thread NEW, RUNABLE, WAITING, TERMINATED

package Assignment;

public class ThreadCreation2 implements Runnable {
    public static Thread thread1;

    public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " is in " + Thread.currentThread().getState()+ " stage");

        thread1 = new Thread(new ThreadCreation2());
		System.out.println(thread1.getName() + " is in " + thread1.getState()+ " stage");
        thread1.start();
    }

    public void run() {
        Thread thread2 = new Thread(new WaitStage());
		System.out.println(thread2.getName() + " is in " + thread2.getState()+ " stage");
        thread2.start();

        try {
            thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
		System.out.println(thread2.getName() + " is in " + thread2.getState()+ " stage");
		System.out.println(Thread.currentThread().getName() + " is in " + Thread.currentThread().getState()+ " stage");
    }
}
class WaitStage implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
			e.printStackTrace();
        }
        
		System.out.println(Thread.currentThread().getName() + " is in " + Thread.currentThread().getState()+ " stage");
		System.out.println(ThreadCreation2.thread1.getName() + " is in " + ThreadCreation2.thread1.getState()+ " stage");
    }
}