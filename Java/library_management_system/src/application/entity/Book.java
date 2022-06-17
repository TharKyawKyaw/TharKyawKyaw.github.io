package application.entity;



public class Book {
	
	private int code;
	private String title;
	private Category category;
	private Author author;
	private int available;
	private Librarian created_by;
	

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public Librarian getCreated_by() {
		return created_by;
	}
	public void setCreated_by(Librarian librarian) {
		this.created_by = librarian;
	}
	
	public String getAuthorName() {
		return this.author.getName();
	}
	
	public String getCategoryName() {
		return this.category.getName();
	}
	public void setStringToInt(String string) {
		this.code = Integer.parseInt(string);
		
	}

}
