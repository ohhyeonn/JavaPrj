package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Homework_20210311 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\tool\\eclipse-workspace\\JavaPrj\\res\\����Ư����ġ��_�ڷγ���Ȳ_20201214.csv");
		Scanner fscan = new Scanner(fis);
		
		String firstLine = fscan.nextLine();
		
		
		
		while(fscan.hasNextLine()) {
		String contentLine = fscan.nextLine();
		String[] content = contentLine.split(",");
		System.out.printf("---------------- \n�������� : %s \n���� Ȯ���� : %s \n���� ����� : %s \n", content[0], content[1] ,content[2]);
		}
	
	
	
	
	
	
		fscan.close();
		fis.close();
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
		
		

	}


