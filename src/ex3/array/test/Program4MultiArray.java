package ex3.array.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program4MultiArray {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("res\\����Ư����ġ��_�ڷγ���Ȳ_20201214.csv");
		Scanner fscan = new Scanner(fis);
		
		String firstLine = fscan.nextLine();
		String[] firstContent = firstLine.split(",");
		
		
//		while(fscan.hasNextLine()) {
//		String contentLine = fscan.nextLine();
//		String[] content = contentLine.split(",");
//		System.out.printf("---------------- \n"+firstContent[0]+" : %s�� %s�� %s�� \n"+ firstContent[1]+" : %s \n"+firstContent[2]+" : %s \n", content[0].substring(0,4),content[0].substring(5,7),content[0].substring(8), content[1] ,content[2]);
//		}
		
		int nujeok =0;
		while(fscan.hasNextLine()) {
			String contentLine = fscan.nextLine();
			String[] content = contentLine.split(",");
		
			nujeok += Integer.parseInt(content[3]);
		}
		
		System.out.printf("���� %s : %d �̴�",firstContent[3], nujeok);

		fscan.close();
		fis.close();
	


	}

}
