package ex2.control;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int kor, eng;
		int math;
		int total;
		double avg;

		kor = 0;
		eng = 0;
		math = 0;
		
		boolean more = true;
		Scanner scan = new Scanner(System.in);
		
		while(more)
		{
			
			
			
			
		System.out.println("������������������������������������������������������");
		System.out.println("��        ���� �Է�		  ��");
		System.out.println("������������������������������������������������������");
		
		
		
		System.out.print("������� �Է��ϼ��� : ");
		kor = scan.nextInt();
			
		System.out.print("������� �Է��ϼ��� : ");
		eng = scan.nextInt();		
		

		System.out.print("���м����� �Է��ϼ��� : ");
		math = scan.nextInt();
		System.out.println("������������������������������������������������������");
		
		
		
		
		
		
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
		
		
		System.out.println("����ҽ� true, �׸��ҽ� false");
		
		
		
		more = scan.nextBoolean();

		
		}
		
		System.out.println("good bye~");
	}

}
