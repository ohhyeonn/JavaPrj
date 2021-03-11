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
		
		
		/// �̹���� txt ���Ͽ� ���ڰ� ����� �˾ƾ߸� �ۼ��Ҽ� �ִ� �ڵ� 
//		for(int i =0; i<7; i++) {
//		names[i] = fscan.next();
//		System.out.printf("%s", names[i]);
//		if(i<6)
//			System.out.printf(", ");
//		}
		
		System.out.println();
		
		/// scan �� hasNextLine();  �ϸ� �� �ϼ��� ���� �ڵ尡���ϴ�
		/// �̰�for���̷����������� while ��ߵȴ�!!!! ����!!!
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
