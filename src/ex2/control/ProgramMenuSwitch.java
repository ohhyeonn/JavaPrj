package ex2.control;

import java.util.Scanner;

public class ProgramMenuSwitch {

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

		EXIT: while (true) {

			int menu = 0;
			System.out.println("������������������������������������������������������");
			System.out.println("��        ���� �޴�		  ��");
			System.out.println("������������������������������������������������������");
			System.out.println("1.���� �Է� ");
			System.out.println("2.���� ��� ");
			System.out.println("3.���� ");
			System.out.println("���ڸ� �Է��ϼ���");
			menu = Integer.parseInt(scan.nextLine());

			switch (menu) {

			case 1:

				System.out.println("������������������������������������������������������");
				System.out.println("��        ���� �Է�		  ��");
				System.out.println("������������������������������������������������������");

				System.out.print("������� �Է��ϼ��� : ");
				kor = Integer.parseInt(scan.nextLine());

				System.out.print("������� �Է��ϼ��� : ");
				eng = Integer.parseInt(scan.nextLine());

				System.out.print("���м����� �Է��ϼ��� : ");
				math = Integer.parseInt(scan.nextLine());

				System.out.println("������������������������������������������������������");
				break;

			case 2:
				total = kor + eng + math;
				avg = total / 3.0;

				System.out.println("������������������������������������������������������");
				System.out.println("��        ���� ���		  ��");
				System.out.println("������������������������������������������������������");
				System.out.printf("���� : %-6.2f\n", (double) kor);
				System.out.printf("���� : %-6.2f\n", (double) eng);
				System.out.printf("���� : %-6.2f\n", (double) math);
				System.out.printf("���� : %-6.2f\n", (double) total);
				System.out.printf("��� : %-6.2f\n", avg);
				System.out.println("������������������������������������������������������");

				System.out.println("����ҽ� true, �׸��ҽ� false");
				more = Boolean.parseBoolean(scan.nextLine());
				if (!more)
					break EXIT;
				
				break;

			case 3:

				break EXIT;

			}
		}
		System.out.println("good bye~");

	}

}
