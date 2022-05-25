package day13;

import java.util.List;

public class CollectionWithLambda {

	public static void main(String[] args) {
		List<String> list = List.of("Html" , "CSS" , "JavaScript" , "PHP" , "Java");
		
		for(String str : list)
			System.out.println(str);
		
		System.out.println("------- with lambda expression -------");
		list.forEach((str) -> System.out.println(str));
		
		list.forEach((str) -> {
			if(str.contains("Java"))
				System.out.println(str);
		});
	}
}
