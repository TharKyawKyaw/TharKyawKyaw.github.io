package day17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Directory_Delete {

	public static void main(String[] args) throws IOException {
		
		// delete empty directory
		Path path = Path.of("./test");
		
//		System.out.println(Files.deleteIfExists(path) ? "Deleted" : "Fail");
		
		
		// delete non-empty directory
		path = Path.of("src/day15");
		
//		boolean deleted = Files.deleteIfExists(path);
//		if(deleted)
//			System.out.println("Success");
		if(Files.exists(path)) {
			Files.walk(path)
					.map(p -> p.toFile())
					.forEach(f -> f.delete());
			
			Files.delete(path);
		}
	}
}
