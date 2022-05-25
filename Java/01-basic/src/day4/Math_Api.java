package day4;

public class Math_Api {
	public static void main(String[] args) {
		System.out.println("Abs value of -7: "+Math.abs(-7));
		System.out.println("Result of 3 power 4: "+Math.pow(3, 4));
		System.out.println("Square root of 81: "+Math.sqrt(81));
		System.out.println("Random value: "+Math.random());
		System.out.println("Max value: "+Math.max(13, 31));
		System.out.println("Min value: "+Math.min(13, 31));
		
		// round
		System.out.println("Round(3.6): "+Math.round(3.6));
		System.out.println("Floor(3.6): "+ Math.floor(3.6));
		System.out.println("Ceil(3.2): "+Math.ceil(3.2));;
		
		// log
		System.out.println("Sing(30): "+Math.sin(30));
		System.out.println("log10(10): "+Math.log10(10));
	}
}
