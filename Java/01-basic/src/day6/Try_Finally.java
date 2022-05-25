package day6;

import java.util.Scanner;

public class Try_Finally {
	public static void main(String[] args) {
		
		
		/*
		 * try { 
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("Enter salary: "); 
		 * int salary =Integer.parseInt(sc.nextLine());
		 * 
		 * if(salary == 0) { return; } System.out.println("Your salary is " + salary); }
		 * finally { System.out.println("It is always executed"); sc.close(); }
		 */
		
		try(Scanner sc = new Scanner(System.in)) {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		/*
		 * try { String name = null; System.out.println("Length: " + name.length()); }
		 * catch (Exception e) { System.err.println("It does not allocate"); }finally {
		 * System.out.println("Always executed"); }
		 */
		System.out.println("Outside try catch block");
	}
}
