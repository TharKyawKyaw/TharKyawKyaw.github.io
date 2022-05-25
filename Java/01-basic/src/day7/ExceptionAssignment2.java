package day7;

import java.util.Scanner;

public class ExceptionAssignment2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] division = {"Kachin State","Kayah State","Kayin State","Chin State","Sagain Division","Tanintharyi Division","Bago Division","Magway Division","Mandalay Division","Mon State","Rakhine State","Yangon Division","Shan State","Ayeyawady Division"};
		
		System.out.print("Input NRCNO: ");
		String nrc = sc.nextLine();
		
		int index1 = nrc.indexOf("/");
		int index2 = nrc.indexOf("(");
		int index3 = nrc.indexOf(")");
		int nrcNo;
		try {
			
			nrcNo = Integer.parseInt(nrc.substring(0, index1));
			
			System.out.println("Division/State = " + division[nrcNo-1]);
			
			String city = nrc.substring(index1+1, index2);
			System.out.println("City = " + city);
			
			int number = Integer.parseInt(nrc.substring(index3+1));
			System.out.println("Number = " + number);	
			
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("NRC is invalid!");
		}catch(NumberFormatException e) {
			System.err.print("User must be input number!");
		}
		
		sc.close();
		
	}
}
