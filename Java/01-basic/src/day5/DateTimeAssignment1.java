package day5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeAssignment1 {
	
	
	
	public static void main(String[] args) {
		
		String[] weekdays = {"MONDAY" , "TUESDAY" , "WEDNESDAY" , "THURSDAY" , "FRIDAY"};
		boolean isMatch =false;
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("E,MMM dd yy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("EEEE");
		
		LocalDate date = LocalDate.now();
		String date1 = format1.format(date);
		String date2 = format2.format(date);
		System.out.println(date1);
		System.out.println("********************");
		for(int i = 0; i < weekdays.length; i++) {
			if(date2.equalsIgnoreCase(weekdays[i])) {
				System.out.println("I have no time.I am studying Programming Language.");
				isMatch = true;
				break;
			}
		}
		if(!isMatch) {
			System.out.println("Today is my holiday!");
		}
		
		
	}
}
