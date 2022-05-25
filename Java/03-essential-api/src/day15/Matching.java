package day15;

import java.util.List;
import java.util.function.Predicate;

public class Matching {

	public static void main(String[] args) {
		var numbers = List.of(2,4,6,8,10,11);
		
		Predicate<Integer> evens = x -> x%2 == 0;
		
		var all_even = numbers.stream().allMatch(n -> n%2 == 0);
		System.out.println("All even: " + all_even);
		
		System.out.println("One even: " + numbers.stream().anyMatch(evens));
		
		System.out.println("No even: " + numbers.stream().noneMatch(evens));
	}
}
