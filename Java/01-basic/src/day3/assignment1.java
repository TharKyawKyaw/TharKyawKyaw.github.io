package day3;

import java.util.Scanner;

public class assignment1 {
	
	public static void main(String[] args) {
		
		int pos = 0;
		int neg = 0;
		int zero = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many number you want to type: ");
		int count = sc.nextInt();
		
		for(int i=0;i<count;i++) {
			System.out.print("Enter any number: ");
			int num = sc.nextInt();
			
			if(num < 0) {
				neg++;
			}
			else if(num > 0) {
				pos++;
			}
			else {
				zero++;
			}
		}
		sc.close();
		System.out.println("Numbers of zero: "+zero);
		System.out.println("Numbers of negative numbers: "+neg);
		System.out.println("Numbers of positive numbers: "+pos);
	}
}
