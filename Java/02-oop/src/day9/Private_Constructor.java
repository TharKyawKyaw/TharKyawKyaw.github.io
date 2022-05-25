package day9;

public class Private_Constructor {

	public static void main(String[] args) {
		
		DatabaseConfig obj1 = DatabaseConfig.getInstance();
		System.out.println("db name of obj1: " + obj1.db_name);
		
		DatabaseConfig obj2 = DatabaseConfig.getInstance();
		System.out.println("db name of obj2: " + obj2.db_name);
		
		obj2.db_name = "banking_db";
		System.out.println("db name of obj1: " + obj1.db_name);
		
	}
}

class DatabaseConfig {
	// static field to store only one object
	String db_name = "employee_db";
	private static DatabaseConfig config = null;
	
	// private constructor
	private DatabaseConfig() {
		
	}
	
	// static method to return object
	static DatabaseConfig getInstance() {
		if(config == null)
			config = new DatabaseConfig();
		return config;
	}
}