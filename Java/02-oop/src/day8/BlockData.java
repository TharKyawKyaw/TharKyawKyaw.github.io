package day8;

public class BlockData {

	static final int MIN_LENGTH;
	final int empId;
	String phone;
	
	public BlockData(String phone) {
		System.out.println("This is constructor block");
		if(phone.length() >= MIN_LENGTH)
			this.phone = phone;
	}
	
	// instance block
	{
		empId = 1;
		phone = "unknown";
		System.out.println("This is instance block");
	}
	
	// static block
	static {
		MIN_LENGTH = 9;
		System.out.println("This is static block");
	}
	
	public static void main(String[] args) {
		BlockData obj1 = new BlockData("09795578841");
		System.out.println("--------------------------------------------");
		BlockData obj2 = new BlockData("123");
	}
}
