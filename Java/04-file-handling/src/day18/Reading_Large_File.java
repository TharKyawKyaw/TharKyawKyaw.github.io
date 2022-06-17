package day18;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Reading_Large_File {

	
	public static void main(String[] args) {
		
		try(FileChannel channel = FileChannel.open(Path.of("src/employee.txt"), StandardOpenOption.APPEND)) {
			
			int bufferSize = 1024;
			if(bufferSize > channel.size())
				bufferSize = (int)channel.size();
			
			ByteBuffer buffer = ByteBuffer.allocate(bufferSize);
			
			while(channel.read(buffer) > 0) {
				buffer.flip();
				String data = new String(buffer.array() , 0 , buffer.limit());
				System.out.println(data);
				buffer.clear();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
