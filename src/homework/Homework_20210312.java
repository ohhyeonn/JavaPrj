package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Homework_20210312 {

	public static void main(String[] args) throws IOException {
		
		
		MAIN : while(true) {
			FileInputStream fis = new FileInputStream("res\\����Ư����ġ��_�ڷγ���Ȳ_20201214.csv");
			Scanner fscan = new Scanner(fis);
			String firstLine = fscan.nextLine();
			String[] firstLineContent = firstLine.split(",");
			Scanner scan = new Scanner(System.in);
			int caseNumber;
			int sum = 0;
			
			System.out.printf("---------------------------\r\n"
					+ "[1] ���� Ȯ����\r\n"
					+ "[2] ���� �����\r\n"
					+ "[3] ���� �˻������ڼ�\r\n"
					+ "[4] �ڰ��ݸ���\r\n"
					+ "[5] �ڰ��ݸ� ����\r\n"
					+ "[6] ��ġ (�ݸ�����)\r\n"
					+ "[7] �ڰ��ݸ�(Ȯ���� ����)\r\n"
					+ "[8] �ڰ��ݸ� (�ؿ��Ա�)\r\n"
					+ "---------------------------");
			
			while(true) {
				System.out.printf("���Ͻô� �հ��� ��ȣ�� ������ �Է����ּ���.\r\n");						 
				caseNumber = Integer.parseInt(scan.nextLine());
				
				if(1> caseNumber || caseNumber>8){
					System.out.printf("�߸� �Է��߽��ϴ� �ٽ� �Է����ּ��� ");
					continue;
				}
				break;
			}
			
	
			while (fscan.hasNextLine()) {
				String contentLine = fscan.nextLine();
				String[] contentLineContent = contentLine.split(",");
				sum += Integer.parseInt(contentLineContent[caseNumber]);
			}
			System.out.printf("���� %s : %d �̴�\n", firstLineContent[caseNumber], sum);
				
				
	
			
			
			
			fscan.close();
			fis.close();
			
			
	
			while(true) {
				System.out.printf("�׸��Ͻðڽ��ϱ�? \n�׸�: 1�Է�\t���: 2�Է�\n");					 
				int continueOrNot = Integer.parseInt(scan.nextLine());
				
				if(1> continueOrNot || continueOrNot>2){
					System.out.printf("�߸� �Է��߽��ϴ� �ٽ� �Է����ּ��� ");
					continue;
				}else if (continueOrNot == 1)
					break MAIN;
				
				break;
			}
		}
		
	
		
	
	
	
	
	
	
	
		
		
		
		
		
		
		
	}
	
	
	
	
	
		
		

	}


