//WAP to handle Arithmetic exception
package Exception_Handling_Demo1;

public class ExceptionHandlingDemo1 {
	public static void main(String[] args) {
		try {
			int data = 100 / 0;
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("Exception Handling Demo");
	}
}
