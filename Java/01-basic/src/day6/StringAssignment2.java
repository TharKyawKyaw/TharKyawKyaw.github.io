package day6;

import java.util.Scanner;

public class StringAssignment2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] presentTense = {"Do","Does"}; 
		boolean isSimple = false;
		System.out.println("Ener formal sentence!");
		String sentence = sc.nextLine();
		
		boolean isQ = sentence.contains("?");
		if(isQ) {
			System.out.println("Sentence is question sentence.");
			String[] firstword = sentence.split(" ");
			for(int i=0; i < presentTense.length; i++) {
				if(firstword[0].equalsIgnoreCase(presentTense[0])) {
					System.out.println("It is simple present tense.");
					isSimple = true;
					break;
				}
			}
			if(!isSimple) {
				System.out.println("It is not simple present tense.");
			}
		}
		
		sc.close();
	}
}
