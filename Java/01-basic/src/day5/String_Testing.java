package day5;

import java.time.LocalDate;
import java.util.Arrays;

public class String_Testing {
	public static void main(String[] args) {
		String s1 = new String(new char[] {'Y','W','K'} );
		String s2 = new String("Java Programming. It is one of high languages. It is also complie language.");
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("Length of s1: " + s1.length());
		System.out.println("Length of s2: " + s2.length());
		
		// change case
		String s3 = s2.toLowerCase();
		System.out.println("After change, s2: " + s2);
		System.out.println("s3: "+ s3);
		s1 = s1.toLowerCase();
		System.out.println("s1: " + s1);
		
		// substring
		String subStr = s2.substring(0,4);
		System.out.println("After change, s2: " + s2);
		System.out.println("SubStr: " + subStr);
		System.out.println("SubStr: " + s2.substring(7));
		
		// replace
		String result = s2.replace("Java", "PHP");
		System.out.println("Replace: " + result);
		
		// concat
		result = s2.concat(" Language");
		System.out.println("Concat: " + result);
		
		// finding
		System.out.println("Contain 'Java': " + s2.contains("Java"));
		System.out.println("Contain 'abc': " + s2.contains("abc"));
		System.out.println("Start with 'abc': " + s2.startsWith("abc"));
		System.out.println("End with 'ing': " + s2.endsWith("ing"));
		
		// location
		int index = s2.indexOf('a');
		System.out.println("Index of 'a': " + index);
		System.out.println("Index of 'a': " + s2.lastIndexOf('a'));
		System.out.println("Index of 'abc': "+ s2.indexOf("abc"));
		
		// split
		String[] data = s2.split(" ");
		System.out.println("Splitting data: " + Arrays.toString(data));
		char[] characters = s2.toCharArray();
		System.out.println("Char array data: " + Arrays.toString(characters));
		
		String rs = String.copyValueOf(characters);
		System.out.println("rs: " + rs);
		System.out.println("string from boolean: " + String.valueOf(true));
		System.out.println("string from int: " + String.valueOf(1000));
		System.out.println("string from localdate: " + String.valueOf(LocalDate.now()));
		
		
		
		
	}
}
