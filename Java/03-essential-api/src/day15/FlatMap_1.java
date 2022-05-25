package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMap_1 {

	public static void main(String[] args) {
		
		List<String> drinks = List.of("Cola" , "Milk Tea" , "Pessi");
		List<String> foods = List.of("Burger" , "Noodles" , "Cake");
		List<String> desserts = List.of("Ice Cream" , "Cake");
		
		List<List<String>> lists = new ArrayList<>();
		
		lists.add(desserts);
		lists.add(foods);
		lists.add(drinks);
		
		System.out.println(lists);
		
		Set<String> flatlist = lists.stream()
									.flatMap(value -> value.stream())
									.collect(Collectors.toSet());
		
		System.out.println(flatlist);
	}
}
