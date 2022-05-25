package day2;

import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your FullName: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Your Email: ");
		String email = sc.next();
		
		System.out.print("Enter Your Phone: ");
		String phone = sc.next();
		
		System.out.print("Enter Your Education: ");
		String education = sc.next();
		
		System.out.print("Enter Your Income: ");
		double income = sc.nextDouble();
		
		System.out.print("Enter Your Age: ");
		int age = sc.nextInt();
		
		System.out.println("");
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Phone: "+phone);
		System.out.println("Education: "+education);
		System.out.println("Income: "+income);
		System.out.println("Age: "+age);
		
		
		sc.close();
	}
}
