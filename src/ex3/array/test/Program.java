package ex3.array.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
	
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		Random rand = new Random();
		
		
		for(int i = 0; i<100; i++) {
			
			int idx1 = rand.nextInt(10);
			int idx2 = rand.nextInt(10);
			int temp=0;
			
			temp = nums[idx1];
			nums[idx1] = nums[idx2];
			nums[idx2] = temp;
			
		}
		
		
		
		
		
		
		for(int i = 0 ; i<10; i++) {
			System.out.printf("%d",nums[i]);
			
			if(i<9)
				System.out.print(", ");
		}
		System.out.println("");
		
		
		
		
		
		for (int j = 0; j < 9; j++) {
			
			for (int i = 0; i < 9-j ; i++) {
				int temp = 0;

				if (nums[i] > nums[i + 1]) {

					temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}

			}
			
			
			
		}
		
		
		for(int i = 0 ; i<10; i++) {
			System.out.printf("%d",nums[i]);
			
			if(i<9)
				System.out.print(", ");
		}
		System.out.println("");

		
		
		
		String[] names = new String[10];
	
		
		
		
		FileInputStream fis = new FileInputStream("C:\\tool\\eclipse-workspace\\JavaPrj\\res\\names.txt");
		Scanner fscan = new Scanner(fis);
		
		
		/// 이방법은 txt 파일에 문자가 몇개인지 알아야만 작성할수 있는 코드 
//		for(int i =0; i<7; i++) {
//		names[i] = fscan.next();
//		System.out.printf("%s", names[i]);
//		if(i<6)
//			System.out.printf(", ");
//		}
		
		System.out.println();
		
		/// scan 의 hasNextLine();  하면 더 완성도 높은 코드가능하다
		/// 이거for문이렇게하지말고 while 써야된다!!!! ㅇㅋ!!!
		for(int i=0; fscan.hasNextLine(); i++) {
			names[i] = fscan.nextLine();
			System.out.printf("%s", names[i]);
			if(fscan.hasNextLine()){
				System.out.print(", ");
			}
		}

		
		
		
		fscan.close();
		fis.close();

		
		
		
		
		
		

		
		
	}

}
