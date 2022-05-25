package day14;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_1 {

	
	public static void main(String[] args) {
		TreeSet<String> set1 = new TreeSet<>();
		
		set1.add("Orange");
		set1.add("Apple");
//		set1.add(null); // cause error
		set1.add("Mango");
		set1.add("Strawberry");
		
		System.out.println(set1);
		
		Iterator<String> itr = set1.iterator();
		itr.forEachRemaining(str -> System.out.println(str + ","));
		
		var set2 = set1.descendingSet();
		System.out.println("\n" + set2);
	}
}
