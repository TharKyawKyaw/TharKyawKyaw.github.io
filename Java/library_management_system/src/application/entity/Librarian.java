package application.entity;

public class Librarian {

	private int id;
	private String name;
	private String password;
	public int getId() {
		return id;
	}
	public String getIdToString(int id) {
		return ""+id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
