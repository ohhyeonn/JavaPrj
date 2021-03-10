package ex3.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res\\img.bmp");
		FileOutputStream fos = new FileOutputStream("res\\img_copy.bmp");
		
		
		// 스트림 버퍼에서 read 나 write 함수이용할떄 매겨변수로 byte[] 배열을 버퍼로 줄수있다!!!!
		int size=0;
		byte[] buf = new byte[1000];
		
		
		while((size = fis.read(buf)) != -1) {
		fos.write(buf,0,size); /// offset과 size 까지 꼭 넣자!! 저런 매개변수로있는 이유가 있다
		}
		
		
		fis.close();
		fos.close();
		
		System.out.println("복사완료");
		
	}

}
