package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Homework_20210312 {

	public static void main(String[] args) throws IOException {
		
		
		MAIN : while(true) {
			FileInputStream fis = new FileInputStream("res\\제주특별자치도_코로나현황_20201214.csv");
			Scanner fscan = new Scanner(fis);
			String firstLine = fscan.nextLine();
			String[] firstLineContent = firstLine.split(",");
			Scanner scan = new Scanner(System.in);
			int caseNumber;
			int sum = 0;
			
			System.out.printf("---------------------------\r\n"
					+ "[1] 제주 확진자\r\n"
					+ "[2] 제주 사망자\r\n"
					+ "[3] 제주 검사진행자수\r\n"
					+ "[4] 자가격리중\r\n"
					+ "[5] 자가격리 해제\r\n"
					+ "[6] 완치 (격리해제)\r\n"
					+ "[7] 자가격리(확진자 접촉)\r\n"
					+ "[8] 자가격리 (해외입국)\r\n"
					+ "---------------------------");
			
			while(true) {
				System.out.printf("원하시는 합계의 번호를 정수로 입력해주세요.\r\n");						 
				caseNumber = Integer.parseInt(scan.nextLine());
				
				if(1> caseNumber || caseNumber>8){
					System.out.printf("잘못 입력했습니다 다시 입력해주세요 ");
					continue;
				}
				break;
			}
			
	
			while (fscan.hasNextLine()) {
				String contentLine = fscan.nextLine();
				String[] contentLineContent = contentLine.split(",");
				sum += Integer.parseInt(contentLineContent[caseNumber]);
			}
			System.out.printf("누적 %s : %d 이다\n", firstLineContent[caseNumber], sum);
				
				
	
			
			
			
			fscan.close();
			fis.close();
			
			
	
			while(true) {
				System.out.printf("그만하시겠습니까? \n그만: 1입력\t계속: 2입력\n");					 
				int continueOrNot = Integer.parseInt(scan.nextLine());
				
				if(1> continueOrNot || continueOrNot>2){
					System.out.printf("잘못 입력했습니다 다시 입력해주세요 ");
					continue;
				}else if (continueOrNot == 1)
					break MAIN;
				
				break;
			}
		}
		
	
		
	
	
	
	
	
	
	
		
		
		
		
		
		
		
	}
	
	
	
	
	
		
		

	}


