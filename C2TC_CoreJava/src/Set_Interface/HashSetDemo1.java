package Set_Interface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		Set<String> hs=new TreeSet<String>();
		hs.add("Hash");
		hs.add("set");
		hs.add("Demo");
		hs.add("Demo");
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}


	}

}
