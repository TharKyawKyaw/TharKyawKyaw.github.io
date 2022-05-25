package day12;

public class Interface_NewFeatures {
	
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.method1();
		obj.method2();
		InterfaceTest.method3();
	}

}


interface InterfaceTest {
	
	void method1();
	
	public default void method2() {
		System.out.println("Add new method.It can be overriden.");
	}
	
	public static void method3() {
		System.out.println("Add mew static method.It cannot be overriden.");
	}
	
}

class MyClass implements InterfaceTest {

	@Override
	public void method1() {
		System.out.println("This is overriden method.");
		
	}
	
	@Override
	public void method2() {
		System.out.println("Default method is overriedn.");
	}
}