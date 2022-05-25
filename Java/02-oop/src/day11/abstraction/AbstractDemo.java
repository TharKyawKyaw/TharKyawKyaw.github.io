package day11.abstraction;

public class AbstractDemo {
	
	public static void main(String[] args) {
		ProductService p_service = new ProductService();
		p_service.connectDatabase();
		p_service.insert();
		p_service.update();
		p_service.delete(101);
		p_service.findById(102);

		System.out.println("----- Abstract class refers its child object -----");
		//DatabaseUtil db_obj = new DatabaseUtil();
		DatabaseUtil db_obj = new ProductService();
		db_obj.connectDatabase();
		db_obj.insert();
		db_obj.update();
		db_obj.delete(101);
	
	}
}
