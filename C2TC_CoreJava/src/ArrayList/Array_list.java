package ArrayList;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(4);
		a1.add(56);
		a1.add(4);			//Duplicates are allowed in array list
		System.out.println(a1);
		a1.add(2, "hello");		//data can be stored at specific index values
		System.out.println(a1);
		a1.remove(4);		//used to remove specific values from list 
		System.out.println(a1);			//if duplication present it removes only one value
		System.out.println("The value present at index 2 is  "+a1.get(2));	//get values present at suitable index
		System.out.println(a1.size());	//obtain size of array
		a1.removeAll(a1);	//removes all the values of a1
		System.out.println(a1);
		
	}

}
