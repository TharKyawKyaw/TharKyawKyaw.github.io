package day11.abstraction;

public class ProductService  extends DatabaseUtil{

	@Override
	public void insert() {
		System.out.println("insert into product values(?,?,?)");
		
	}

	@Override
	public void update() {
		System.out.println("update product set price = ?");
		
	}

	@Override
	public boolean delete(int id) {
		System.out.println("DELETE FROM product WHERE id = " + id);
		return false;
	}

	@Override
	public Object findById(int id) {
		System.out.println("SELECT * FROM product WHERE product_id = " + id);
		return null;
	}

}
