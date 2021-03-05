package ex2.control;

import java.util.Scanner;

public class IfProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		if(x%2 != 0 && x != 0) {
			System.out.println("홀수값");
		} else if(x%2 == 0 && x != 0) {
			System.out.println("짝수값");
		}
		
		
		if(x%3 == 0 && x != 0) {
			System.out.println("3의 배수다");
		}else if(x%5 == 0 && x != 0){
			System.out.println("5의 배수다");
		}else {
			System.out.println("그외다");
		}
		
		
			System.out.println("프로그램 끝!");
	}

}
