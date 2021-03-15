package ex3.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) throws IOException {

		
		/// 카운트계산
		int count;
		{
			count  = 0;
			FileInputStream fis = new FileInputStream("res\\제주특별자치도_코로나현황_20201214.csv");
			Scanner fscan = new Scanner(fis);
			
			while(fscan.hasNextLine()) {
				fscan.nextLine();
				count++;
	
				
			}
			
			fscan.close();
			fis.close();
			

		}
		
		
		
		
		
		
		
		/// 입력과 출력
		String[][] rows;
		
		{
			FileInputStream fis = new FileInputStream("res\\제주특별자치도_코로나현황_20201214.csv");
			Scanner fscan = new Scanner(fis);
			rows  = new String[count][];
			
		
			String temp;
			
			
			for(int j=0; j<count; j++) {
				temp = fscan.nextLine();
				rows[j] = temp.split(",");
			
				for(int i=0; i<10; i++) {
					System.out.printf("%s", rows[j][i]);
					if(i<9) {
						System.out.printf(", ");
					}
				}
				System.out.println();
			}

			fscan.close();
			fis.close();
		}
		
		
		
		/// 누적 구하기
		{
			
			int sum=0;
	
			for(int i =1; i<count-1;i++) {
				sum += Integer.parseInt(rows[i][7]);
			}
			
			System.out.printf("누적은 %s 이다!!", sum);
			
		}
		
		
		
		
		
		
	}

}
