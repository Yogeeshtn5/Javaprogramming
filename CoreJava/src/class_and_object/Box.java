package class_and_object;
import java.util.Scanner;

public class Box
{
//class variables
		double dblWidth;
		double dblHeight;
		double dblDepth;
		//static variables
		static int boxid;
		
  public Box()
  {
  }
public double calcVolume()
  {
	double dbltemp;
	dbltemp=dblWidth * dblHeight * dblDepth;
	return dbltemp;
  }
public static void main(String args[]) 
{
	/*
	 * Scanner sc=new Scanner(System.in);
	 *System.out.println("Enter the width of the box");
	 *double w=sc.nextDouble();
	 *System.out.println("Enter the Height of the box");
	 *double h=sc.nextDouble();
	 *System.out.println("Enter the depth of the box");
	 *double v=sc.nextDouble();
	 */
	Box box1=new Box();
	box1.dblHeight=12.22;
	box1.dblWidth=10.22;
	box1.dblDepth=2;
	System.out.println("volume of the box is "+box1.calcVolume());
	
	Box box2=new Box();
	box2.dblHeight=30.00;
	box2.dblWidth=40.22;
	box2.dblDepth=2;
	System.out.println("volume of the box is "+box2.calcVolume());

}
}
