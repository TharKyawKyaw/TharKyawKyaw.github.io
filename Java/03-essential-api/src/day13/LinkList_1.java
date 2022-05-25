package day13;

import java.util.LinkedList;

public class LinkList_1 {

	public static void main(String[] args) {
		var list1 = new LinkedList<>();
		
		list1.add("Nilar");
		list1.add(0,"Aung Aung");
		list1.add("Kyaw Kyaw");
		
		System.out.println(list1);
		
		list1.addFirst("Jeon");
		list1.addLast("Cherry");
		
		System.out.println(list1);
		System.out.println("[2]: " + list1.get(2));
		System.out.println("last: " + list1.getLast());
	}
}
