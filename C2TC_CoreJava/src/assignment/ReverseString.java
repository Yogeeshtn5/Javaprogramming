//WAP to reverse a string using String Class
package assignment;

public class ReverseString {

	public static void main(String[] args) {
		String s = new String("Sam");
		System.out.println("The given string is: " + s);
		char[] ch = s.toCharArray();
		System.out.println("The reverse of the given string is: ");
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}