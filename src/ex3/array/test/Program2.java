package ex3.array.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
	
		
		String[] names = new String[] {"��ȣ��", "���缮", "����", "���", "��α�", "ŷ��", "�ɳ�" };
		
		for(int i=0; i<7; i++) {
			System.out.printf("\"%s\"", names[i]);
			if(i<7-1)
				System.out.print(", ");
		}
		
		System.out.println();
		
		
		Random rand = new Random();
		for(int i =0; i<100; i++) {
			int idx1 = rand.nextInt(7);
			int idx2 = rand.nextInt(7);
			System.out.printf("idx1 : %s, idx2: %s \n", idx1, idx2);
			
			String temp;
			temp = names[idx1];
			names[idx1] = names[idx2];
			names[idx2] = temp;
		}
		
		
		
		for (int i =0; i<7; i++) {
			System.out.printf("\"%s\"",names[i]);
			if(i<7-1) {
				System.out.print(", ");;
			}
		}

		
		System.out.println();
		for (int j = 0; j < 6; j++) {

			for (int i = 0; i < 6 - j; i++) {
				String temp;

				if ((names[i].compareTo(names[i + 1]))>0) {

					temp = names[i];
					names[i] = names[i + 1];
					names[i + 1] = temp;
				}

			}

		}
		
		for (int i =0; i<7; i++) {
			System.out.printf("\"%s\"",names[i]);
			if(i<7-1) {
				System.out.print(", ");;
			}
		}
		
		
		
		
		
		
		System.out.println();
			
		String n1 = "ȫ�浿";
		String n2 = "ȫ�浿";
		String n3 = new String("ȫ�浿");
		String n4 = new String("ȫ�浿");
		
		System.out.println(n1 == n2);
		System.out.println(n1.equals(n2));
		System.out.println(n3 == n4);
		System.out.println(n3.equals(n4));
		
		
		String fileName = "photo.jpg";
		System.out.println(fileName.length());
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.substring(3));
		System.out.println(fileName.substring(3,5));
		
		
		
		String fileName2 ="�ƹ���.�ƹ���";
		int dotIndex = fileName2.indexOf(".");
		System.out.println(fileName2.substring(0,dotIndex));
		
		
		System.out.println("4".compareTo("44"));
		
		
	}

}
