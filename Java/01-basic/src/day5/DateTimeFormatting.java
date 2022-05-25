package day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatting {
	public static void main(String[] args) {
		
		// predefined constants
		DateTimeFormatter dateFormat = DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter timeFormat = DateTimeFormatter.ISO_LOCAL_TIME;
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("format1: " + date.format(dateFormat));
		System.out.println("format2: "+ timeFormat.format(time));
		System.out.println("format3: " + dateTime.format(dateTimeFormat));
		
		// custom pattern
		System.out.println("------ Using Custom Pattern -----");
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh-mm-ss a");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MMMM dd yyyy 'at' hh:mm:ss");
		
		System.out.println("Default format: "+date);
		System.out.println("Custom format: "+f1.format(date));
		
		System.out.println("Default format: "+time);
		System.out.println("Custom format: "+time.format(f2));
		
		System.out.println("Default format: "+dateTime);
		System.out.println("Custom format: "+ f3.format(dateTime));
		
		// localized pattern
		System.out.println("----- Using Localized Pattern -----");
		DateTimeFormatter format_1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
		System.out.println("Default format: " + date);
		//System.out.println("Localized format: " + date.format(format_1));
		System.out.format("Long format:  %s\n", date.format(format_1));
		
		System.out.println("Full format: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		
		System.out.println("Medium format: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		
		System.out.println("Short format: " +DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(date));
		
		//System.out.format("Name: %s, Age: %d", "Su Su",20);
		//System.out.println("Name: "+ "Su Su" + ", Age: " + 20);
		
	
	}
}
