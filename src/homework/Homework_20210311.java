package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Homework_20210311 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res\\제주특별자치도_코로나현황_20201214.csv");
		Scanner fscan = new Scanner(fis);
		
		String firstLine = fscan.nextLine();
		
		
		
		while(fscan.hasNextLine()) {
		String contentLine = fscan.nextLine();
		String[] content = contentLine.split(",");
		System.out.printf("---------------- \n기준일자 : %s년 %s월 %s일 \n제주 확진자 : %s \n제주 사망자 : %s \n", content[0].substring(0,4),content[0].substring(5,7),content[0].substring(8), content[1] ,content[2]);
		}

		fscan.close();
		fis.close();
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
		
		

	}


