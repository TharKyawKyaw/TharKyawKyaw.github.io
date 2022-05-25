package day12;

class MyClass implements Interface1 {

	@Override
	public void display(String name) {
		System.out.println(name);
		
	}
	
	
}

public class Functional_Interface {
	
	public static void main(String[] args) {
		
		Interface1 interface1 = new MyClass();
		interface1.display("Cherry");
		
		Interface1 test1 = new Interface1() {

			@Override
			public void display(String name) {
				System.out.println(name);
				
			}
		};
		
		test1.display("Aung Aung");
		
		MyInterface1 test2= (str) -> System.out.println("Name is " + str);
		test2.display("Mg Mg");
		
		Interface3 test3 = (name,pwd) -> {
			if(name.equals("jeon") && pwd.equals("123")) 
				return true;
			
			else
				return false;
		};
		
		System.out.println((test3.CheckLogin("jeon", "123")) ? "Login Success" : "Invalid");
		System.out.println((test3.CheckLogin("thar", "123")) ? "Login Success" : "Invalid");
		System.out.println((test3.CheckLogin("jeon", "135")) ? "Login Success" : "Invalid");
		
		Interface2 sum = (a,b) -> a + b;
		Interface2 mul = (a,b) -> a * b;
		Interface2 div = (a,b) -> a / b;
		
		System.out.println("Sum: " + sum.operate(100, 50));
		System.out.println("Mul: " + mul.operate(100, 50));
		System.out.println("Div: " + div.operate(100, 50));
	}

}

@FunctionalInterface
interface MyInterface1 {
	
	void display(String name);
}
