package homework;

import java.util.Scanner;

public class Homework_20210305 {

	public static void main(String[] args) {
		// 변수를 받고 소인수분해하여 각 소인수를 배열에 담아놓은다
		// 정수를 입력받고 그수가 소인수에 속한지 비교한다
		// 아니면 아니다 맞으면 맞다
		// 중복됬으면 다른 소인수를입력하라
		// 다입력되었을시 완료가 된다.

		int i = 2;
		int num;

		int[] arr = new int[101];
		int index = 0;
		int j = 1;
		int temp;

		Scanner scan = new Scanner(System.in);

		System.out.print("양의 정수를 입력하시오 : ");
		num = scan.nextInt();
		int number = num;

		while (i <= number) {

			while (number % i == 0) {

				number = number / i;
				arr[index] = i;
				index++;
			}
			i++;
		}

		System.out.printf("%d의 소인수 개수는 %d개 입니다 ", num, index);

		System.out.printf("수를 입력하여 소인수를 찾으세요 중복이 허용됩니다 \n 맞을시 맞다고 나오고 아닐시 반응이 없습니다 \n  ");
		int count = index;

		while (true) {

			temp = scan.nextInt();

			int z = 0;

			while (z <= (index - 1)) {
				if (temp == arr[z]) {
					System.out.println("맞습니다");
					System.out.printf("%d 개남았습니다 %d는 이제 답안으로 제출하지 마세요 제출시 오류발생 \n", count -= 1, temp);
				}

				if (count == 0) {
					System.out.println("끝");
					break;
				}
				
				z++;

			}

		}

	}
}
