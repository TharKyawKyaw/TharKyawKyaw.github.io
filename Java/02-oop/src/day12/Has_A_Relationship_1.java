package day12;

public class Has_A_Relationship_1 {
	
	public static void main(String[] args) {
		
		Author auth1 = new Author("Mya Than Tint" , "Myaing");
		Book book1 = new Book("War and Peace" , 6800 , auth1);
		
		System.out.println("Book Name: " + book1.name);
		System.out.println("Price: " + book1.price);
		System.out.println("------- Author Information -------");
		System.out.println("Author Name: " + book1.author.name);
		System.out.println("Author Native Town: " + book1.author.native_town);
	}
}

class Author {
	String name;
	String native_town;
	
	Author(String name,String town){
		this.name = name;
		this.native_town = town;
	}
	
}

class Book { 
	String name;
	int price;
	Author author; // has-a relationship
	
	public Book(String name,int price,Author author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}
}
