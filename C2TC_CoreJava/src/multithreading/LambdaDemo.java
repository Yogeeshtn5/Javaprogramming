package multithreading;

public class LambdaDemo {
	public static void main(String[] args) {
		/**Lambda expression is used to increase code efficiency
		 * whenever we are using class which will be used once
		 * Instead of creating multiple class we can write anonymous class
		 * 
		 */
		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 4; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 4; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException y) {
				}
			}
		});
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		t2.start();
	}
}