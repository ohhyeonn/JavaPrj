package homework;

import java.util.Scanner;

public class Homework_20210305 {

	public static void main(String[] args) {
		// ������ �ް� ���μ������Ͽ� �� ���μ��� �迭�� ��Ƴ�����
		// ������ �Է¹ް� �׼��� ���μ��� ������ ���Ѵ�
		// �ƴϸ� �ƴϴ� ������ �´�
		// �ߺ������� �ٸ� ���μ����Է��϶�
		// ���ԷµǾ����� �Ϸᰡ �ȴ�.

		int i = 2;
		int num;

		int[] arr = new int[101];
		int index = 0;
		int j = 1;
		int temp;

		Scanner scan = new Scanner(System.in);

		System.out.print("���� ������ �Է��Ͻÿ� : ");
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

		System.out.printf("%d�� ���μ� ������ %d�� �Դϴ� ", num, index);

		System.out.printf("���� �Է��Ͽ� ���μ��� ã������ �ߺ��� ���˴ϴ� \n ������ �´ٰ� ������ �ƴҽ� ������ �����ϴ� \n  ");
		int count = index;

		while (true) {

			temp = scan.nextInt();

			int z = 0;

			while (z <= (index - 1)) {
				if (temp == arr[z]) {
					System.out.println("�½��ϴ�");
					System.out.printf("%d �����ҽ��ϴ� %d�� ���� ������� �������� ������ ����� �����߻� \n", count -= 1, temp);
				}

				if (count == 0) {
					System.out.println("��");
					break;
				}
				
				z++;

			}

		}

	}
}
