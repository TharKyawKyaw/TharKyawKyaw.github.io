package day6;

import java.util.Scanner;

public class StringAssignment3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input NRCNO: ");
		String nrc = sc.nextLine();
		
		int index1 = nrc.indexOf("/");
		int index2 = nrc.indexOf("(");
		int index3 = nrc.indexOf(")");
		
		String township = nrc.substring(index1+1, index2);
		System.out.println("Township: " + township);
		

		String number = nrc.substring(index3+1);
		System.out.println("Number: " + number);
		
		sc.close();
	}
}
