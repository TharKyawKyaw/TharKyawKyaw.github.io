package day7;

import java.util.Scanner;

public class ExceptionAssignment1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter how many numbers want to enter : ");
		int count = Integer.parseInt(sc.nextLine());
		String[] inputNum = new String[count];
		
		for(int i = 0; i < count; i++) {
			System.out.print("Enter number: ");
			inputNum[i] = sc.nextLine();
		}
		
		int[] nums = new int[count];
		
		try {
			System.out.println("Your numbers are");
			for(int i = 0; i < count; i++) {
				nums[i] = Integer.parseInt(inputNum[i]);
				System.out.println(nums[i]);
			}
			int average = 0;
			int sum = 0;
			
		} catch (IllegalArgumentException e) {
			System.err.print(e.getMessage());
		}
		
		int average = 0;
		int sum = 0;
		try {
			for(var num:nums) {
				sum += num;
			}
			average = sum/count;
			System.out.println("Average is " + average);
		}catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		

		try {
			int max =nums[0];
			int min = nums[0];
			for(var num:nums) {
				if(max < num) {
					max = num;
				}
				else if(min > num) {
					min = num;
				}
			}
			System.out.println("Maximum number is " + max);
			System.out.println("Minimum number is " + min);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		
		sc.close();

	}
	

}

//String[] nums = {"1","2","c","15","d"};
//InputNumber inputNum = new InputNumber(nums); 
//System.out.println(inputNum);