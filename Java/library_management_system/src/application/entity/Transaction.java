package application.entity;

import java.time.LocalDate;

public class Transaction {

	private int id;
	private Member member_id;
	private Book book_id;
	private LocalDate borrow_date;
	private LocalDate due_date;
	private LocalDate return_date;
	private int fees;
	private Librarian created_by;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Member getMember_id() {
		return member_id;
	}
	public void setMember_id(Member member_id) {
		this.member_id = member_id;
	}
	public Book getBook_id() {
		return book_id;
	}
	public void setBook_id(Book book_id) {
		this.book_id = book_id;
	}
	public LocalDate getBorrow_date() {
		return borrow_date;
	}
	public void setBorrow_date(LocalDate borrow_date) {
		this.borrow_date = borrow_date;
	}
	public LocalDate getDue_date() {
		return due_date;
	}
	public void setDue_date(LocalDate due_date) {
		this.due_date = due_date;
	}
	public LocalDate getReturn_date() {
		return return_date;
	}
	public void setReturn_date(LocalDate return_date) {
		this.return_date = return_date;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public Librarian getCreated_by() {
		return created_by;
	}
	public void setCreated_by(Librarian created_by) {
		this.created_by = created_by;
	}
	public String getMemberName() {
		return this.getMember_id().getName();
	}
	public String getTitleName() {
		return this.getBook_id().getTitle();
	}
	public String getLibrarianName() {
		return this.getCreated_by().getName();
	}
	
}
