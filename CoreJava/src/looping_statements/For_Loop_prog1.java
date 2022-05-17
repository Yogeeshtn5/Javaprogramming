package looping_statements;
import java.util.Scanner;

public class For_Loop_prog1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num = 0;
		System.out.println("Enter any Number");
		num=sc.nextInt();
		for(int i = 1; i<= 10; i++)
		{
			System.out.println(num+"X"+i+'='+num*i);
		}

	}

}
