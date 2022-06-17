package day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Reading_2 {

	public static void main(String[] args) throws IOException {
		
		byte[] data = Files.readAllBytes(Path.of("src/emplist.txt"));
		
		System.out.println(new String(data));
		
		System.out.println("------- Files.ReadString -------");
		String values = Files.readString(Path.of("src/emplist.txt"));
		System.out.println(values);
		
		System.out.println("------- Reading with BufferReader -------");
		
		try(BufferedReader reader = Files.newBufferedReader(Path.of("src/emplist.txt"))) {
			
			var line = "";
			while((line = reader.readLine()) != null) {
				if(line.contains("Aung"))
					System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
