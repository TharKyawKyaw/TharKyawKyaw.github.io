package day10.inheritance;

public class Teacher extends Person{
	
	private String position;

	public Teacher(String name ,String pos) {
		super(name);
		this.position = pos;

	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Position - " + position);
		System.out.println("----------------------------------");
	}
	
	public void display() {
		System.out.println("This is display");
	}

}
