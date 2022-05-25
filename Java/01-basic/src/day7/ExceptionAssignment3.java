package day7;

import java.util.Scanner;

public class ExceptionAssignment3 {
	
	static void validateMark(int mark) throws InvalidMarkException {
		if(mark < 0 || mark > 100) 
			throw new InvalidMarkException("Mark is not valid!");
	
		else
			System.out.println("Your mark is " + mark);
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter your mark: ");
			int mark = sc.nextInt();
			validateMark(mark);
	}catch(InvalidMarkException e) {
		System.err.println("Error Message: "+e.getMessage());
	}
		
		sc.close();
	}
}
