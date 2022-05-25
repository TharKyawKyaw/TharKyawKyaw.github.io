package day15;

import java.util.List;
import java.util.stream.Collectors;

public class Filtering_1 {

	public static void main(String[] args) {
		
		var users = List.of(
				new User("Kyaw Kyaw", "Admin"),
				new User("Aung Aung" , "Staff"),
				new User("Maung Maung" , "Staff"),
				new User("Yuri" , "Customer"),
				new User("Jeon" , "Customer")
				);
		
//		users.stream()
////				.filter(u -> u.getRole().equalsIgnoreCase("Staff"))
//				.filter(User::IsStaff)
//				.forEach(u -> System.out.println(u.getName() + ", " + u.getRole()));
//		
		
		List<String> names = users.stream()
									.filter(u -> u.getName().contains("aung") && u.getRole().equalsIgnoreCase("Staff"))
									.map(u -> u.getName())
									.collect(Collectors.toList());
		
		System.out.println(names);
	}
}

class User {
	
	private String name;
	private String role;
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	boolean IsStaff() {
		return this.role.equalsIgnoreCase("staff");
	}
}
