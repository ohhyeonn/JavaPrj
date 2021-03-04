package ex1.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {

		FileInputStream fis  = new FileInputStream(".\\res\\img.bmp");
		
		int b;
		b = fis.read();
		b = fis.read();
		
		
		int b1 = fis.read();
		int b2 = fis.read();
		int b3 = fis.read();
		int b4 = fis.read();
		
		int fileSize = 0;
		
		
		
		
		fileSize = ((b4&0x000000ff)<<24) |
				   ((b3&0x000000ff)<<16) |
				   ((b2&0x000000ff)<<8)|
				   (b1);
		
		
		
		
		System.out.println(Integer.toBinaryString(b4));
		System.out.println(Integer.toBinaryString(b3));
		System.out.println(Integer.toBinaryString(b2));
		System.out.println(Integer.toBinaryString(b1));

		System.out.printf("%d", fileSize);
		
	
		

		
		fis.close();
		
}		
}
