package day8;

import java.time.LocalDate;

class Book{
	String title;
	LocalDate publishDate;
	int price;
	
	public Book(String title,LocalDate publishDate,int price) {
		super();
		this.title = title;
		this.publishDate = publishDate;
		this.price = price;
	}
	
	public Book(Book other) {
		this.title = other.title;
		this.publishDate = other.publishDate;
		this.price = other.price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", publishDate=" + publishDate + ", price=" + price + "]";
	}
	
	
//	@Override
//	public String toString() {
//		return String.format("Name: %s Price: %d", title,price);
//	}
}

public class Copy_Constructor {
	
	public static void main(String[] args) {
		
		LocalDate publish = LocalDate.of(1961, 10, 18);
		
		Book book1 = new Book("Detective U San Shar" , publish , 6000);
		System.out.println(book1);
		
		Book book2 = new Book(book1);
		System.out.println(book2);
	}

}
