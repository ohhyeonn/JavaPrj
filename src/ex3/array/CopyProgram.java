package ex3.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res\\img.bmp");
		FileOutputStream fos = new FileOutputStream("res\\img_copy.bmp");
		
		
		// ��Ʈ�� ���ۿ��� read �� write �Լ��̿��ҋ� �Űܺ����� byte[] �迭�� ���۷� �ټ��ִ�!!!!
		int size=0;
		byte[] buf = new byte[1000];
		
		
		while((size = fis.read(buf)) != -1) {
		fos.write(buf,0,size); /// offset�� size ���� �� ����!! ���� �Ű��������ִ� ������ �ִ�
		}
		
		
		fis.close();
		fos.close();
		
		System.out.println("����Ϸ�");
		
	}

}
