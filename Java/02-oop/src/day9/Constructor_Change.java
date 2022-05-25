package day9;

public class Constructor_Change {
	
	public Constructor_Change() {
		this(7);
		System.out.println("This is default constructor");
//		this(7); must be first statement
	}
	
	
	public Constructor_Change(int i) {
		this(100,200);
		System.out.println("This is one argument constructor");
		
	}
	
	public Constructor_Change(int i,int j) {
		System.out.println("i = " + i + ", j = "+  j);
	}

	public static void main(String[] args) {
	
		Constructor_Change obj = new Constructor_Change();

	}
}

class Employee {
	private String name;
	
	Employee() {
		
	}
	
	Employee(String name) {
		this.name = name;
	}
}

class Teacher extends Employee{
	
	private String position;
	
	Teacher(String name,String pos){
		super(name);
		this.position = pos;
	}
}
