package day14;

import java.util.HashMap;
import java.util.Map;

public class HashMap_1 {

	public static void main(String[] args) {
		Map<String, String> foods = new HashMap<>();
		
		foods.put("Orange", "Fruit");
		foods.put("Grape", "Fruit");
		
		var another1 = Map.of("Mango" , "Fruit" , "Potato" , "Vegetable");
		foods.putAll(another1);
		

		
		var another2 = Map.ofEntries(
				Map.entry("Coffee", "Juice"),
				Map.entry("Milk Tea", "Juice")
				);
		
		foods.putAll(another2);
		
		foods.forEach((k,v) -> System.out.println(k + " => " + v));
		
		foods.putIfAbsent("kiwi" , "Fruit");
		
//		System.out.println("After new item: " + foods);
//		
//		System.out.println("Contain Coffee? " + foods.containsKey("Coffee"));
//		System.out.println("Contain value('Snack'): " + foods.containsValue("Snack"));
//		
//		var keys = foods.keySet();
//		System.out.println("All keys0: " + keys);
//		
//		var values = foods.values();
//		System.out.println("All values: " + values);
//		
//		foods.remove("Mango");
//		System.out.println("All keys: " + foods.keySet());
//		
//		foods.keySet().removeIf(k -> k.contains("Tea"));
//		System.out.println("After remove: " + foods);
//		
//		
//		foods.values().removeIf(v -> v.equalsIgnoreCase("fruit"));
//		System.out.println("After remove: " + foods);
		
		foods.replace("Mango", "Pineapple");
		System.out.println("[Mango]: " + foods.get("Mango")); // get specified key
		
		foods.compute("Coffee", (k,v) -> v.toUpperCase());
		System.out.println("[Coffee]: " + foods.get("Coffee")); 
		
		foods.compute("Cake", (k,v) -> "Snack");
		System.out.println("[Cake]: " + foods.get("Cake"));
		
		foods.computeIfAbsent("Orange", k -> "Juice");
		System.out.println("[Orange]: " + foods.get("Orange"));
		
		foods.computeIfAbsent("Banana", k -> "Fruit");
		System.out.println("[Banana]: " + foods.get("Banana"));
		
		foods.computeIfPresent("Orange", (k,v) -> "Juice");
		System.out.println("[Orange]: " + foods.get("Orange"));
		
		foods.computeIfPresent("Corn" , (k,v) -> "Vegetable");
		System.out.println("[Corn]: " + foods.get("Corns"));
		
	}
}
