package day12;

import java.time.LocalDate;

public class Has_A_Relationship_2 {

	public static void main(String[] args) {
		
		SaleRecord[] records = new SaleRecord[3];
		
		Product prod1 = new Product("Coffee", 1500);
		Product prod2 = new Product("Energy Drink", 1000);
		
		records[0] = new SaleRecord(1001, prod1, 2);
		records[1] = new SaleRecord(1002, prod2, 3);
		records[2] = new SaleRecord(1003, prod1, 1);
		
		System.out.println("Code\t Sale Date\t Product Name\t Price\t Quantity\t SubTotal");
		for(var sale : records) {
			sale.showData();
		}
		
	}
}

class Product {
	String name;
	int price;
	
	Product(String name,int price) {
		this.name = name;
		this.price = price;
	}
}

class SaleRecord {
	int id;
	int sale_qty;
	LocalDate sale_date;
	Product product;
	
	SaleRecord(int id,Product product,int qty){
		this.id = id;
		this.sale_date = LocalDate.now();
		this.product = product;
		this.sale_qty = qty;
	}
	
	void showData() {
		System.out.print(id + "\t");
		System.out.print(sale_date + "\t");
		System.out.print(product.name + "\t");
		System.out.print(product.price + " ks.\t");
		System.out.print(sale_qty + "\t");
		System.out.print((product.price * sale_qty) + " .ks\n");
		
		
	}
}