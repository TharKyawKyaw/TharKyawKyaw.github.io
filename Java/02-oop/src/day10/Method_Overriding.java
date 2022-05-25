package day10;

public class Method_Overriding {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.show();
		cat.sound();
		cat.sound("Meow");
		cat.display();
		cat.display("Shwe War");
		
//		Animal meow = new Cat();
//		meow.show();
//		meow.display();
	}

}

class Animal {
	
	void show() {
		System.out.println("This is show method");
	}
	
	void sound() {
		System.out.println("Some sound");
	}
}

class Cat extends Animal{
	
	@Override
	void sound() {
		System.out.println("Myaung");
	}
	
	void sound(String yell) {
		System.out.println(yell);
	}
	
	void display() {
		System.out.println("This is display with 0 parameter");
	}
	
	void display(String name) {
		System.out.println("This is display with 1 parameter");
	}
	
	
}