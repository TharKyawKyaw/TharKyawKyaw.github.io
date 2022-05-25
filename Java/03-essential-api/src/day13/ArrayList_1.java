package day13;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		//add
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(100);
		
		System.out.println("Size: " + list.size());
		
		list.add(1 , 40);
		System.out.println("List1: " + list);
		
		System.out.println("[2]: " + list.get(2));
		
		list.set(0, 204);
		
		System.out.println("[0]: " + list.get(0));
		
		System.out.println("Is empty: " + list.isEmpty());
		
		list.remove(1);
		System.out.println("After remove: " + list);
		System.out.println("Size: " + list.size());
		
		System.out.println("Max: " + Collections.max(list));
		System.out.println("Min: " + Collections.min(list));
		
		list.clear();
		System.out.println("Size: " + list.size());
		System.out.println("Is empty: " + list.isEmpty());
		
		
	}
}
