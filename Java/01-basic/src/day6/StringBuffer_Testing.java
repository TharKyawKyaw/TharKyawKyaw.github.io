package day6;

public class StringBuffer_Testing {
	
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Java Programming");
		
		buffer.append(" Language");
		System.out.println("append: " + buffer);
		
		buffer.insert(5 , "is a ");
		System.out.println("insert: " + buffer);
		
		buffer.replace(0, 4, "PHP");
		System.out.println("replace: " + buffer);
		
		System.out.println("indexOf: " + buffer.indexOf("Language"));
		System.out.println("Length: " + buffer.length());
		System.out.println("substring: " + buffer.substring(4));
		System.out.println("Length: " + buffer.length());
		System.out.println("delete: " + buffer.delete(0,4));
		System.out.println("Length: " + buffer.length());
	}
}
