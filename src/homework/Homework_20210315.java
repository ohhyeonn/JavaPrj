package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Homework_20210315 {

	public static void main(String[] args) throws IOException {

		
		/// ������ 2���� �迭 ����
		int[][] gugudan = new int[9][9];
		for(int i=0; i<9;i++) {
			for(int j=0; j<9;j++) {
				gugudan[i][j] = (i+1)*(j+1);
			}
		}
		
		
		
		/// ������ �Է¹ް� ���
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.printf("���ڷ� ���е� 1~9 ������ ���� ������ ����,���� �̷��������� �Է��ϼ���\n");
			String inputLine = scan.nextLine();
			String[] inputArray = inputLine.split(",");
			int iIndex = Integer.parseInt(inputArray[0])-1;
			int jIndex = Integer.parseInt(inputArray[1])-1;
			System.out.printf("�Է��Ͻ� %s * %s �� ���� = %d �Դϴ�.\n", inputArray[0], inputArray[1], gugudan[iIndex][jIndex]);
			System.out.printf("��� �Ͻ÷��� 1\t���߽÷��� 2\t �� ��������.\n");
			if(Integer.parseInt(scan.nextLine())==2) {
				System.out.print("�ȳ���������");
				break;
			}
				
		}
		
		

	}
}

