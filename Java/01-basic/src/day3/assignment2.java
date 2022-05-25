package day3;

import java.util.Scanner;

public class assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float sleepTime = 0;
		String isExit = "n";

		
		while(isExit.equals("n")) {
			
			System.out.println("When do you go bed?");
			float sleep= sc.nextFloat();
			
			System.out.println("When do you get up?");
			float getUp = sc.nextFloat();
			
			sleepTime = (getUp+12) - sleep;
			
			if(sleepTime >= 5 && sleepTime <= 8) {
				System.out.println("You take care your health well.");
			}
			else if(sleepTime < 5) {
				System.out.println("You are very hardworking!");
			}
			else if(sleepTime > 8) {
				System.out.println("You are abnormal!");
			}
			
			System.out.println("Do you want to exit y/n: ");
			isExit = sc.next();
		}
		sc.close();
	}
}
