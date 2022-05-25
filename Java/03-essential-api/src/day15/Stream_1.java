package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Stream_1 {

	public static void main(String[] args) {
		int[] prices = {1700,400,6000,700,1000,2000,3000,1600};
		
		
		// create stream
		IntStream streams = Arrays.stream(prices);
		
		streams.filter(p -> p > 1500)
			.sorted()
			.forEach(p -> System.out.println(p));
		
		
		System.out.println("------- Without Stream API -------");
		
		List<Integer> new_data = new ArrayList<>();
		
		// filter
		for(var p: prices) {
			if(p > 1500)
				new_data.add(p);
		}
		
		// sorting
		Collections.sort(new_data);
		
		for(var p: new_data) {
			System.out.println(p);
		}
			
	}
}
