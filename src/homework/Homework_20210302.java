package homework;

import java.util.Scanner;

public class Homework_20210302 {
	public static void main(String [] args) {


	String name;
	String age;
	String city;
	String hobby;
	
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("������������������������������������������������������");
	System.out.println("��        ���� �Է�		  ��");
	System.out.println("������������������������������������������������������");
	
	System.out.println("������ �Է��ϼ���");
	
	
	System.out.printf("�̸� : ");
	name = scan.nextLine();
	
	System.out.printf("���� : ");
	age = scan.nextLine();
	
	System.out.printf("���� : ");
	city = scan.nextLine();
	
	System.out.printf("��� : ");
	hobby = scan.nextLine();
	




	System.out.println("������������������������������������������������������");
	System.out.println("��        ���� ����		  ��");
	System.out.println("������������������������������������������������������");
	System.out.printf("�̸� : %s\n",name);
	System.out.printf("���� : %s\n",age);
	System.out.printf("���� : %s\n",city);
	System.out.printf("��� : %s\n",hobby);
	System.out.printf("���̸��� %s ���̴� %s �̰�� ��°��� %s ��̴� %s �Դϴ�.\n",name, age, city, hobby);
	System.out.println("������������������������������������������������������");
	}
	
}
