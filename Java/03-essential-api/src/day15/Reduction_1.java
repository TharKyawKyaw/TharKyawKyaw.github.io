package day15;

import java.util.Comparator;
import java.util.List;

public class Reduction_1 {

	public static void main(String[] args) {
		
		List<Employee> employees = List.of(
				new Employee("Kyaw Kyaw" , 9800 , "Yangon"),
				new Employee("Aung Aung" , 6000 , "Mandalay"),
				new Employee("Mg Mg" , 10000 , "Mandalay"),
				new Employee("Yuri" , 6000 , "Yangon"),
				new Employee("Jeon" , 7800 , "Monywa" )
				);
		
		// built-in reduction
		int total_1 = employees.stream().mapToInt(Employee::getSalary).sum();
		double avg_salary = employees.stream().mapToDouble(emp -> emp.getSalary()).average().getAsDouble();
		int max_salary = employees.stream().mapToInt(Employee::getSalary).max().getAsInt();
		long count = employees.stream().filter(emp -> emp.getSalary() > 6000).count();
		
		Employee empMax = employees.stream().max(Comparator.comparingInt(emp -> emp.getSalary())).get();
		Employee empMin = employees.stream().min((e1,e2) -> e1.getSalary() - e2.getSalary()).get();
				
		System.out.println("Total Salary: " + total_1);
		System.out.println("Average Salary: " + avg_salary);
		System.out.println("Max Salary: " + max_salary);
		System.out.println("Count: " + count);
		
		System.out.println("Employee got max salary: " + empMax);
		System.out.println("Employee got min salary: " + empMin);
		
		
		// custom reduction ( use reduce method )
		int total_2 = employees.stream()
								.map(emp -> emp.getSalary())
								.reduce(0,(s1,s2) -> s1 + s2);
		
		int min_salary = employees.stream()
								.mapToInt(emp -> emp.getSalary())
								.reduce(Integer::min)
//								.reduce((e1,e2) -> e1 > e2 ? e2 : e1)
								.getAsInt();
		
		Employee emp_max = employees.stream()
								.reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e2 : e1)
								.get();
		
		System.out.println("Total Salary: " + total_2);
		System.out.println("Min Salary: " + min_salary);
		System.out.println("Employee got max salary: " + emp_max);
									
		
		
	}
}
