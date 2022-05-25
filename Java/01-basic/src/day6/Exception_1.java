package day6;

import java.util.Scanner;

public class Exception_1 {
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number1: ");
			int num1 = Integer.parseInt(sc.nextLine()); // create exception object and throw it
			
			System.out.println("Enter number2: ");;
			int num2 = Integer.parseInt(sc.nextLine());
			
			int result = num1/num2;
			System.out.println("Result: " + result);
			sc.close();
		}
		catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.err.println("User input must be number");
		}
		
		System.out.println("Outside try catch block");
	}
}
