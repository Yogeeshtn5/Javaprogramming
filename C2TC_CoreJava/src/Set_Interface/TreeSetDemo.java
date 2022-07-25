package Set_Interface;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		/** TreeSet[C]
		 * Implementation class of NavigableSet[I]
		 * Data Structure ---> Balanced Tree
		 * Duplicates are not allowed
		 * Insertion order not preserved
		 * Heterogeneous objects not allowed
		 */
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(100);
		t.add(70);
		t.add(50);
		t.add(23);
		t.add(54);
		t.add(12);
		t.add(87);
		t.add(56);
		t.add(121);
		t.add(97);
		t.add(66);
		t.add(66);
		//t.add(null);//null insertion not allowed
		System.out.println(t);

	}

}
