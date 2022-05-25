package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling {
	
	
	static void display(int num) {
		System.out.println("number is " + num);
		display(num);
	}
	
	public static void main(String[] args) {
		//display(7000);
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			br.readLine();
		}
		catch(NullPointerException e) {
			System.out.println("This is null");
		}
		catch(IOException e) {
			System.out.println("Something is wrong!");
		}
		finally {
			System.out.println("It is always executed!");
		}
		

	}
}
