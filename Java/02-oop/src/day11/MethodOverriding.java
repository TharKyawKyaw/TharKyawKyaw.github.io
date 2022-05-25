package day11;

public class MethodOverriding {

	public static void main(String[] args) {
		
		Developer developer = new Developer();
		developer.work();
		
		developer = new FrontendDeveloper();
		developer.work();
		
		developer = new BackendDeveloper();
		developer.work();
	}
}

class Developer{
	void work() {
		System.out.println("Some work");
	}
	
	
}

class FrontendDeveloper extends Developer{
	
	@Override
	void work() {
		System.out.println("Doing frontend technologies");
	}
}

class BackendDeveloper extends Developer{
	
	@Override
	void work() {
		System.out.println("Doing backend technologies");
	}
}
