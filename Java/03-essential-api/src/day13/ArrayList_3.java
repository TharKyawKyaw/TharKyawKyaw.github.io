package day13;

import java.util.ArrayList;

public class ArrayList_3 {

	public static void main(String[] args) {
		
		var list = new ArrayList<Phone>();
		
		Phone p = new Phone("Samsung" , 1500000);
		list.add(p);
		list.add(new Phone("iPhone" , 2000000));
		list.add(new Phone("Vivo" , 1200000));
		
		System.out.println(list);
		System.out.println("----- For Each -----");
		list.forEach(ph -> System.out.println("Brand: " + ph.brand + ", Price: " + ph.price));
		
		System.out.println("------- price > 1300000 -------");
		list.forEach(ph -> {
			if(ph.price > 1300000)
				System.out.println(ph);
		});
		
		var phone = list.get(0);
		System.out.println("[0]: " + phone);
	}
}

class Phone {
	String brand;
	int price;
	
	Phone(String brand, int price){
		this.brand = brand;
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", price=" + price + "]";
	}
	
	
}