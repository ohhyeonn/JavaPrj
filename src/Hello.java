import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;



public class Hello {

	public static void main(String[] args) throws IOException {

		int kor, eng;
		int math;
		int total;
		double avg;

		kor = 0;
		eng = 0;
		math = 0;
		
		
		
		FileInputStream fis = new FileInputStream("C:\\tool\\eclipse-workspace\\JavaPrj\\data.txt");
		Scanner scan1 = new Scanner(fis);
		kor = scan1.nextInt();
		eng = scan1.nextInt();
		math = scan1.nextInt();
		
		
		
		
		
		
//		System.out.println("������������������������������������������������������");
//		System.out.println("��        ���� �Է�		  ��");
//		System.out.println("������������������������������������������������������");
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("������� �Է��ϼ��� : ");
//		kor = scan.nextInt();
//			
//		System.out.print("������� �Է��ϼ��� : ");
//		eng = scan.nextInt();		
//		
//
//		System.out.print("���м����� �Է��ϼ��� : ");
//		math = scan.nextInt();
//		System.out.println("������������������������������������������������������");
		
		
		

		total = kor + eng + math;
		avg = total / 3.0;

		System.out.println("������������������������������������������������������");
		System.out.println("��        ���� ���		  ��");
		System.out.println("������������������������������������������������������");
		System.out.printf("���� : %-6.2f\n",(double)kor);
		System.out.printf("���� : %-6.2f\n",(double)eng);
		System.out.printf("���� : %-6.2f\n",(double)math);
		System.out.printf("���� : %-6.2f\n",(double)total);
		System.out.printf("��� : %-6.2f\n",avg);
		System.out.println("������������������������������������������������������");
		
		/*
		System.out.print("������� �Է��ϼ���: ");
		int code = System.in.read();
		System.out.printf("code is %c\n", code);
		*/
		
		
		
		
		
		


	}

}
