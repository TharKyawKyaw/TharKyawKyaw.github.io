package day8;

public class Static_Fields {

	public static void main(String[] args) {
		
		try {
			//create obj and initialize
			Employee emp1 = new Employee();
			emp1.initData("Aung Aung", 500000);
			emp1.viewInformation();
			
			Employee emp2 = new Employee();
			emp2.initData("Su Su", 600000);
			
			Employee emp3 = new Employee();
			emp3.initData("Cherry", 300000);

			//display
			emp1.showData();
			System.out.println("----------");
			emp2.showData();
			System.out.println("----------");
			emp3.showData();
			System.out.println("----------");
			
			emp3.name = "Hla Hla";
			System.out.println("After change name: " + emp3.name);
			emp3.changeData("Cherry", 350000);
			System.out.println("After change salary: " + emp3.salary);
//			emp3.empId = 5;
			
			Employee.changeNoOfEmployee(5);
			
			Employee emp4 = new Employee();
			emp4.initData("Naung Naung", 450000);
			
			emp4.showData();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

class Employee {
	
	static int noOfEmployee = 3;
	static int nextId = 1;
	static final float bonus = 2.5f;
	
	final int empId;
	String name;
	int salary;
	
	
	Employee() throws AppException{
		if(nextId > noOfEmployee) {
			throw new AppException("Sorry! Limited number has been reached!");
		}
		this.empId = nextId;
		nextId++;
	}
	
	void initData(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	void changeData(String editName , int editSalary) {
		if(!name.equalsIgnoreCase(editName)) 
			this.name = editName;
		
		if(salary != editSalary)
			this.salary = editSalary;
	}
	
	void showData() {
		System.out.println("ID: " + this.empId);
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
	}
	
	static void changeNoOfEmployee(int no) {
		noOfEmployee = no;
//		this.name = "abc";
//		salary = 300000;
//		showData();
//		test();
	}
	void viewInformation() {
		System.out.println("Total Employee: " + noOfEmployee);
		System.out.println("Current Information");
		showData();
		System.out.println("Next employee no: " + nextId);
	}
	static void test() {
		
	}
}

class AppException extends Exception{


	private static final long serialVersionUID = 1L;
	
	public AppException(String msg) {
		super(msg);
	}
	
}
