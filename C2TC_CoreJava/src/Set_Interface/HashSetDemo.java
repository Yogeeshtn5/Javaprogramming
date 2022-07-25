package Set_Interface;

import java.util.HashSet;

/**
 * Set is the child interface of collection
 * Set is used when we don't need duplicates and insertion order is not required
 * set don't contain any new methods
 */
public class HashSetDemo {

	public static void main(String[] args) {
	/** HashSet is the implementation class of Set[I]
	 * 	HashTable is underlying DataStructre.
	 * Objects will be stored based on HashCode
	 * Null insertion is Possible
	 * Due to HashCode Search algorithm is easy. 
	 * HashSet is the best choice if we want to perform only search operation.
	 */
		HashSet h1=new HashSet(); // initial capacity will be 16
		h1.add(10);
		h1.add(30);
		h1.add("Sam");
		h1.add('s');
		System.out.println(h1.add(10)); //it returns false if we add duplicates
		h1.add(null);
		h1.add(true);
		h1.add(false);
		System.out.println(h1);
		 
	}

}
