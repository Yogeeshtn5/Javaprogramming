package multithreading;

class Hi extends Thread {
	public void run() {
		for (int i = 0; i <= 4; i++) {
			System.out.println("Hi");
			/**
			 * If we try to sleep a thread it may throw exception Hence it is surrounded
			 * with try catch block
			 */
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Hello extends Thread {
	public void run() {
		for (int i = 0; i <= 4; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		Hi t1 = new Hi();
		Hello t2 = new Hello();
		t1.start(); // When we say start the thread always executes run method
		/**
		 * There may be a chance that the both the threads reach scheduler at same time,
		 * based on different criteria scheduler choose thread to overcome this drawback
		 * we need to have delay between two threads
		 */
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		t2.start();

	}

}