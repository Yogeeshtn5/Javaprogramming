package Set_Interface;

import java.util.LinkedHashSet;

public class Linked_HashSetDemo {

	public static void main(String[] args) {
		/**It  is a subclass of hashSet[c]
		 * Underlying D.S is HashTable + LinkedList
		 * Duplicates are not allowed.
		 * Null insertion is possible (only once).
		 * Insertion order preserved.
		 * We go for this D.S 
		 */
		LinkedHashSet l=new LinkedHashSet();
		l.add(1);
		l.add('3');
		l.add(1.1);
		l.add(true);
		l.add(1);
		l.add(null);
		l.add(null);
		System.out.println(l);
	}

}
