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
				
				int i=0;
				
				WOW: while (true) {
					

					switch (i) {

					case 0:
						System.out.print("국어성적을 입력하세요 : ");
						score[0] = Integer.parseInt(scan.nextLine());

						if (!(score[0] <= 100 && score[0] >= 0))
							System.out.println("0 ~ 100 범위의 값만 입력 받을수 있습니다");
						else
							i++;

						break;

					case 1:
						System.out.print("영어성적을 입력하세요 : ");
						score[1] = Integer.parseInt(scan.nextLine());

						if (!(score[1] <= 100 && score[1] >= 0))
							System.out.println("0 ~ 100 범위의 값만 입력 받을수 있습니다");
						else 
							i++;

						break;

					case 2:
						
						System.out.print("수학성적을 입력하세요 : ");
						score[2] = Integer.parseInt(scan.nextLine());

						if (!(score[2] <= 100 && score[2] >= 0)) {
							System.out.println("0 ~ 100 범위의 값만 입력 받을수 있습니다");
						} else {
							System.out.println("───────────────────────────");
							break WOW;
						}
						break;

					}

				

				}
				break;

			case 2:
				score[3] = score[0] + score[1] + score[2];
				avg = score[3] / 3.0;

				System.out.println("┌─────────────────────────┐");
				System.out.println("│        성적 출력		  │");
				System.out.println("└─────────────────────────┘");

				System.out.printf("국어 : %-6.2f\n", (double) score[0]);
				System.out.printf("영어 : %-6.2f\n", (double) score[1]);
				System.out.printf("수학 : %-6.2f\n", (double) score[2]);
				System.out.printf("총점 : %-6.2f\n", (double) score[3]);
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
