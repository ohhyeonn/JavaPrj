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
			System.out.println("┌─────────────────────────┐");
			System.out.println("│        메인 메뉴		  │");
			System.out.println("└─────────────────────────┘");
			System.out.println("1.성적 입력 ");
			System.out.println("2.성적 출력 ");
			System.out.println("3.종료 ");
			System.out.println("숫자를 입력하세요");
			menu = Integer.parseInt(scan.nextLine());

			switch (menu) {

			case 1:

				System.out.println("┌─────────────────────────┐");
				System.out.println("│        성적 입력		  │");
				System.out.println("└─────────────────────────┘");

				System.out.print("국어성적을 입력하세요 : ");
				kor = Integer.parseInt(scan.nextLine());

				System.out.print("영어성적을 입력하세요 : ");
				eng = Integer.parseInt(scan.nextLine());

				System.out.print("수학성적을 입력하세요 : ");
				math = Integer.parseInt(scan.nextLine());

				System.out.println("───────────────────────────");
				break;

			case 2:
				total = kor + eng + math;
				avg = total / 3.0;

				System.out.println("┌─────────────────────────┐");
				System.out.println("│        성적 출력		  │");
				System.out.println("└─────────────────────────┘");
				System.out.printf("국어 : %-6.2f\n", (double) kor);
				System.out.printf("영어 : %-6.2f\n", (double) eng);
				System.out.printf("수학 : %-6.2f\n", (double) math);
				System.out.printf("총점 : %-6.2f\n", (double) total);
				System.out.printf("평균 : %-6.2f\n", avg);
				System.out.println("───────────────────────────");

				System.out.println("계속할시 true, 그만할시 false");
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
