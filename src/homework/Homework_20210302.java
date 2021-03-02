package homework;

import java.util.Scanner;

public class Homework_20210302 {
	public static void main(String [] args) {


	String name;
	String age;
	String city;
	String hobby;
	
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("┌─────────────────────────┐");
	System.out.println("│        정보 입력		  │");
	System.out.println("└─────────────────────────┘");
	
	System.out.println("정보를 입력하세요");
	
	
	System.out.printf("이름 : ");
	name = scan.nextLine();
	
	System.out.printf("나이 : ");
	age = scan.nextLine();
	
	System.out.printf("지역 : ");
	city = scan.nextLine();
	
	System.out.printf("취미 : ");
	hobby = scan.nextLine();
	




	System.out.println("┌─────────────────────────┐");
	System.out.println("│        나의 정보		  │");
	System.out.println("└─────────────────────────┘");
	System.out.printf("이름 : %s\n",name);
	System.out.printf("나이 : %s\n",age);
	System.out.printf("지역 : %s\n",city);
	System.out.printf("취미 : %s\n",hobby);
	System.out.printf("제이름은 %s 나이는 %s 이고요 사는곳은 %s 취미는 %s 입니다.\n",name, age, city, hobby);
	System.out.println("───────────────────────────");
	}
	
}
