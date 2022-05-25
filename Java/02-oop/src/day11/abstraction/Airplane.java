package day11.abstraction;

public class Airplane implements Flying{

	@Override
	public void fly() {
		System.out.println("Airplane fly with engine");
	}
}
