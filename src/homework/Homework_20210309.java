package homework;

import java.util.Scanner;

public class Homework_20210309 {

	public static void main(String[] args) {
		

		double avg;

		int score[] = {0,0,0,0};
		

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
				
				int i=0;
				
				WOW: while (true) {
					

					switch (i) {

					case 0:
						System.out.print("������� �Է��ϼ��� : ");
						score[0] = Integer.parseInt(scan.nextLine());

						if (!(score[0] <= 100 && score[0] >= 0))
							System.out.println("0 ~ 100 ������ ���� �Է� ������ �ֽ��ϴ�");
						else
							i++;

						break;

					case 1:
						System.out.print("������� �Է��ϼ��� : ");
						score[1] = Integer.parseInt(scan.nextLine());

						if (!(score[1] <= 100 && score[1] >= 0))
							System.out.println("0 ~ 100 ������ ���� �Է� ������ �ֽ��ϴ�");
						else 
							i++;

						break;

					case 2:
						
						System.out.print("���м����� �Է��ϼ��� : ");
						score[2] = Integer.parseInt(scan.nextLine());

						if (!(score[2] <= 100 && score[2] >= 0)) {
							System.out.println("0 ~ 100 ������ ���� �Է� ������ �ֽ��ϴ�");
						} else {
							System.out.println("������������������������������������������������������");
							break WOW;
						}
						break;

					}

				

				}
				break;

			case 2:
				score[3] = score[0] + score[1] + score[2];
				avg = score[3] / 3.0;

				System.out.println("������������������������������������������������������");
				System.out.println("��        ���� ���		  ��");
				System.out.println("������������������������������������������������������");

				System.out.printf("���� : %-6.2f\n", (double) score[0]);
				System.out.printf("���� : %-6.2f\n", (double) score[1]);
				System.out.printf("���� : %-6.2f\n", (double) score[2]);
				System.out.printf("���� : %-6.2f\n", (double) score[3]);
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
