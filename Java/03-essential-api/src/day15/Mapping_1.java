package day15;

import java.util.List;
import java.util.stream.Collectors;

public class Mapping_1 {

	public static void main(String[] args) {
		
		List<Employee> employees = List.of(
				new Employee("Kyaw Kyaw" , 9800 , "Yangon"),
				new Employee("Aung Aung" , 6000 , "Mandalay"),
				new Employee("Mg Mg" , 10000 , "Mandalay"),
				new Employee("Yuri" , 6000 , "Yangon"),
				new Employee("Jeon" , 7800 , "Monywa" )
				);
		
//		
//		List<String> cities = employees.stream()
//										.map(emp -> emp.getCity())
//										.distinct()
//										.collect(Collectors.toList());
//		
//		System.out.println(cities);
//		
//		int[] salaries = employees.stream()
//									.filter(emp -> emp.getSalary() > 6000)
//									.mapToInt(Employee::getSalary)
//									.toArray();
//		for(var s: salaries)
//			System.out.println(s);
//		
//		
//		List<Integer> salaries = employees.stream()
//										.map(emp -> emp.getSalary())
//										.filter(s -> s < 10000)
//										.limit(3)
//										.toList();
//		for (var s: salaries)
//			System.out.println(s);
		
		int max_salary = employees.stream()
								.mapToInt(emp -> emp.getSalary())
								.max()
								.getAsInt();
		
		int min_salary = employees.stream()
								.mapToInt(Employee::getSalary)
								.min()
								.getAsInt();
		
		System.out.println("Max Salary: " + max_salary);
		System.out.println("Min Salary: " + min_salary);
				
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
