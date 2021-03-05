package ex2.control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res\\img.bmp");
		FileOutputStream fos = new FileOutputStream("res\\img_copy.bmp");
		
		
		
		int b=0;
		
		
		while((b = fis.read()) != -1) {
		fos.write(b);
		}
		
		
		fis.close();
		fos.close();
		
	}

}
