package ex2.control;

import java.util.Scanner;

public class IfProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		if(x%2 != 0 && x != 0) {
			System.out.println("Ȧ����");
		} else if(x%2 == 0 && x != 0) {
			System.out.println("¦����");
		}
		
		
		if(x%3 == 0 && x != 0) {
			System.out.println("3�� �����");
		}else if(x%5 == 0 && x != 0){
			System.out.println("5�� �����");
		}else {
			System.out.println("�׿ܴ�");
		}
		
		
			System.out.println("���α׷� ��!");
	}

}
