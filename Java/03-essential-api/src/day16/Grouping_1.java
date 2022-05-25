package day16;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping_1 {

	public static void main(String[] args) {
		List<Employee> emp = List.of(
				new Employee("Kyaw Kyaw" , 9800 , "Yangon"),
				new Employee("Aung Aung" , 6000 , "Mandalay"),
				new Employee("Mg Mg" , 10000 , "Mandalay"),
				new Employee("Yuri" , 6000 , "Yangon"),
				new Employee("Jeon" , 7800 , "Monywa" )
				);
		
		Map<String, Long> counting = emp.stream()
										.collect(
												Collectors.groupingBy(
														e -> e.getCity(), 
														Collectors.counting()
														)
												);
//		System.out.println(counting);
		
		Map<String, Integer> sum = emp.stream()
										.collect(
												Collectors.groupingBy(
														e -> e.getCity(),
														Collectors.summingInt(e -> e.getSalary())
														)
												);
//		System.out.println(sum);
		
		var avg = emp.stream()
					.collect(
							Collectors.groupingBy(
									e -> e.getCity(),
									Collectors.averagingDouble(e -> e.getSalary())
									)
							);
//		System.out.println(avg);
		
		Map<Integer, List<Employee>> groupBySalary = emp.stream()
														.collect(
																Collectors.groupingBy(
																		e -> e.getSalary()
																		)
																);
		
//		groupBySalary.forEach((k,list) -> {
//			System.out.println(k + "ks.");
//			list.forEach(e -> {
//				System.out.println("\t" + e.getName() + "(" + e.getCity() + ")");
//			});
//		});
														
		// name of each city
		Map<String, List<String>> groupByCity = emp.stream()
													.collect(
															Collectors.groupingBy(
																	Employee::getCity,
																	Collectors.mapping(Employee::getName, Collectors.toList())
																	)
															);
		
//		System.out.println(groupByCity);
		
		Map<String, List<Employee>> data = emp.stream()
												.collect(
														Collectors.collectingAndThen(
																Collectors.groupingBy(Employee::getCity),
																map -> map.entrySet()
																		.stream()
																		.filter(e -> e.getValue().size() > 1)
																		.collect(Collectors.toMap(v -> v.getKey(), v -> v.getValue()))
																)
														);
//		System.out.println(data);
		data.forEach((city,list) -> {
			System.out.println(city);
			list.forEach(emps -> {
				System.out.println("\t" + emps.getName());
			});
		});
		
	}
	
	
}


class Employee {
	
	private String name;
	private int salary;
	private String city;
	
	public Employee(String name, int salary, String city) {
		super();
		this.name = name;
		this.salary = salary;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}
	
	
	
}
