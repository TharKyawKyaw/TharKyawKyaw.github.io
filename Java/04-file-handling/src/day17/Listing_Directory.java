package day17;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Listing_Directory {

	public static void main(String[] args) {
		
		Path path = Path.of(".");
		
		try(Stream<Path> fileList = Files.list(path)) {
			
			fileList.forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("----- with Walk() method -----");
		
		try(Stream<Path> fileList = Files.walk(path)) {
			fileList.forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
