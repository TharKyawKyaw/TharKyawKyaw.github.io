package day5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeAssignment2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("EEEE, MMMM dd yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("hh:mm:ss a");
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();


		
		String[] menu = {"Pizza" , "Burger" , "Milk Tea" , "Spicy Noodle"};
		String[] township = { "AA" ,"BB" , "CC" ,"DD" };
		long[] townshipTime = {15,30,45,10};
		String[] order = { "Order Now?" , "Preorder?" };
		
		System.out.println("******* Available Menu *******");
		for(int i = 0; i < menu.length; i++) {
			System.out.println(i+1 + ". " + menu[i]);
		}
		System.out.print("Please choose item: ");
		int menuItem = Integer.parseInt(sc.nextLine());
		System.out.println(menuItem);
		
		System.out.println("******* Deliverable Township *******");
		for(int i = 0; i < township.length; i++) {
			System.out.println(i+1 + ". " + township[i] + " (" + townshipTime[i] + " mins)");
		}
		System.out.print("Please choose township: ");
		int twsItem = Integer.parseInt(sc.nextLine());
		System.out.println(twsItem);
		LocalTime deliveryTime = time.plusMinutes(townshipTime[twsItem-1]);
		
		System.out.println("******* Deliverable Township *******");
		for(int i = 0; i < order.length; i++) {
			System.out.println(i+1 + ". " + order[i]);
		}
		System.out.print("Please choose 1 or 2: ");
		int orderType = Integer.parseInt(sc.nextLine());
		System.out.println(orderType);
		

		if(orderType == 1) {
			System.out.println("******* Your Order Information *******");
			System.out.println("Item Name: " + menu[menuItem-1]);
			System.out.println("Your Address: " + township[twsItem-1]);
			System.out.println("Duration: " + townshipTime[twsItem-1] + " mins");
			System.out.println("Arrival Time: " + deliveryTime.format(format2));
		}
		else if(orderType == 2) {
			System.out.println("Enter deliver date (dd): ");
			int deliDate = Integer.parseInt(sc.nextLine());
			LocalDate deliveryDate;
			if(date.getDayOfMonth() > deliDate) {
				deliveryDate = LocalDate.of(date.getYear(),date.plusMonths(1).getMonth(), deliDate);
			}
			else {
				deliveryDate = LocalDate.of(date.getYear(), date.getMonth(), deliDate);
			}
			System.out.println("******* Your Order Information *******");
			System.out.println("Item Name: " + menu[menuItem-1]);
			System.out.println("Your Address: " + township[twsItem-1]);
			System.out.println("Arrival Date: " + deliveryDate.format(format1));
		}
		System.out.println("******* Thank you for your ordering *******");
		sc.close();
	}
}
