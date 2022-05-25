package day10.inheritance;

public class Demo {

	public static void main(String[] args) {
		
		Person p1 = new Person("Kyaw");
		p1.showInfo();
		
		Teacher t1 = new Teacher("Thar","Game Developer");
		t1.showInfo();
		
		Person p2 = new Teacher("Kyaw" , "GD");
		p2.showInfo();
		p2.test();
//		p2.display();
		
		// data type casting
		int a = 100;
		long b = a; // implicit casting
		
		Person p3 = t1; // implicit casting
		p3.showInfo();
		
//		Teacher t2 = (Teacher) p1; // new Person
		// ClassCastException
		
		Teacher t3 = (Teacher) p2; // explicit casting ( new Teacher )
		t3.showInfo();
		
	}
}
