package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Homework_20210315 {

	public static void main(String[] args) throws IOException {

		
		/// 구구단 2차월 배열 생성
		int[][] gugudan = new int[9][9];
		for(int i=0; i<9;i++) {
			for(int j=0; j<9;j++) {
				gugudan[i][j] = (i+1)*(j+1);
			}
		}
		
		
		
		/// 구구단 입력받고 출력
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.printf("숫자로 구분된 1~9 까지의 양의 정수를 정수,정수 이런형식으로 입력하세요\n");
			String inputLine = scan.nextLine();
			String[] inputArray = inputLine.split(",");
			int iIndex = Integer.parseInt(inputArray[0])-1;
			int jIndex = Integer.parseInt(inputArray[1])-1;
			System.out.printf("입력하신 %s * %s 의 값은 = %d 입니다.\n", inputArray[0], inputArray[1], gugudan[iIndex][jIndex]);
			System.out.printf("계속 하시려면 1\t멈추시려면 2\t 를 누르세요.\n");
			if(Integer.parseInt(scan.nextLine())==2) {
				System.out.print("안녕히가세요");
				break;
			}
				
		}
		
		

	}
}

