package day18;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Reading_with_Channel {

	public static void main(String[] args) {
		
		try(RandomAccessFile input = new RandomAccessFile("src/employee.txt", "r");
			
			FileChannel channel = input.getChannel()){
				
			long fileSize = channel.size();
			
			// create byteBuffer
			ByteBuffer buffer = ByteBuffer.allocate((int)fileSize);
			
			// read data from channel to buffer
			channel.read(buffer);
			
			// prepare to read data from buffer
			buffer.flip();
			
			String data = new String(buffer.array(), 0 , buffer.limit());
			System.out.println(data);
			
			
			
			
		} catch (Exception e) {
			e.fillInStackTrace();
		}
	}
}
