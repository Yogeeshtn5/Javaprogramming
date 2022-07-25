//WAP to reverse a String using StringBuffer
package assignment;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Sam");
		System.out.println("The given string is: " + s);
		System.out.println("The reverse of the given string is: ");
		System.out.println(s.reverse());
	}
}