package day7;

public class Demo {

	public static void main(String[] args) {
		
		Phone p1 = new Phone("iPhone" , "pink" , 1800000);
		Phone p2 = new Phone("Samsung" , "purple" , 38000000);
		Phone p3 = new Phone("Vivo" , "black" , 1000000);
		
		System.out.println("----- Phone1's Data -----");
		System.out.println("Brand: " + p1.brand  + ", Color: " + p1.color + ", Price: " + p1.price);
		
		System.out.println("----- Phone2's Data -----");
		System.out.format("Brand: %s, Color: %s, Price: %d\n" , p2.brand,p2.color,p2.price);
		
		System.out.println("----- Phone3's Data -----");
		System.out.format("Brand: %s, Color: %s, Price: %d\n" , p3.brand,p3.color,p3.price);
	}
}
