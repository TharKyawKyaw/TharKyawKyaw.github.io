package day7;

public class Phone {

	// fields
	String brand;
	String color;
	int price;
	
	// constructor
	public Phone() {
		
	}

	public Phone(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	
	// methods
	void call() {
		System.out.println("Make Phone call");
	}
	void sendSms() {
		System.out.println("Send message");
	}
}
